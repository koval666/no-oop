package ru.teadev.fp.service;

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

@RequiredArgsConstructor
public class OrderService {

    private final ClientService clientService;
    private final SubscriptionService subscriptionService;
    private final PromoService promoService;
    private final PaymentService paymentService;

    public void acceptSubscription(Order order) throws ClientNotExistException,
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
