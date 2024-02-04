package ru.teadev.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fplike.entity.Client;
import ru.teadev.fplike.entity.Discount;
import ru.teadev.fplike.entity.Order;
import ru.teadev.fplike.entity.Price;
import ru.teadev.fplike.entity.Subscription;
import ru.teadev.fplike.exceptions.ClientNotExistException;
import ru.teadev.fplike.exceptions.NotEnoughMoneyException;
import ru.teadev.fplike.exceptions.PaymentException;
import ru.teadev.fplike.exceptions.SubscriptionNotAvailable;

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
