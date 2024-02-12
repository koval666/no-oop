package ru.teadev.fp.usecase;

import lombok.RequiredArgsConstructor;
import ru.teadev.fp.entity.Client;
import ru.teadev.fp.entity.Discount;
import ru.teadev.fp.entity.Order;
import ru.teadev.fp.entity.Price;
import ru.teadev.fp.entity.Subscription;
import ru.teadev.fp.exceptions.ClientNotExistException;
import ru.teadev.fp.exceptions.NotEnoughMoneyException;
import ru.teadev.fp.exceptions.PaymentException;
import ru.teadev.fp.exceptions.SubscriptionNotAvailable;
import ru.teadev.fp.service.ClientService;
import ru.teadev.fp.service.PaymentService;
import ru.teadev.fp.service.PromoService;
import ru.teadev.fp.service.SubscriptionService;

@RequiredArgsConstructor
public class BuySubscriptionUseCase {

    private final ClientService clientService;
    private final SubscriptionService subscriptionService;
    private final PromoService promoService;
    private final PaymentService paymentService;

    @SuppressWarnings("unused")
    public void execute(Order order) throws ClientNotExistException,
            SubscriptionNotAvailable, NotEnoughMoneyException, PaymentException {

        Client client = order.getClient();
        if (!clientService.isClientExist(client)) {
            throw new ClientNotExistException(client);
        }

        Subscription subscription = order.getSubscription();
        if (!subscriptionService.isSubscriptionAvailable(subscription)) {
            throw new SubscriptionNotAvailable(subscription);
        }

        Discount discount = promoService.calculateDiscount(client, subscription);
        Price price = promoService.applyDiscount(subscription.getBasePrice(), discount);

        if (!clientService.isEnoughMoney(client, price)) {
            throw new NotEnoughMoneyException(client, price);
        }

        paymentService.makePayment(client, subscription, price);

        subscriptionService.activateSubscription(client, subscription);
    }

}
