package ru.teadev.ooplike.usecase;

import lombok.RequiredArgsConstructor;
import ru.teadev.ooplike.entity.Client;
import ru.teadev.ooplike.entity.ClientId;
import ru.teadev.ooplike.entity.Order;
import ru.teadev.ooplike.entity.Subscription;
import ru.teadev.ooplike.exceptions.ClientNotExistException;
import ru.teadev.ooplike.exceptions.NotEnoughMoneyException;
import ru.teadev.ooplike.exceptions.PaymentException;
import ru.teadev.ooplike.exceptions.SubscriptionNotAvailable;
import ru.teadev.ooplike.service.ClientExtractor;
import ru.teadev.ooplike.service.ClientPersister;
import ru.teadev.ooplike.service.PaymentProvider;
import ru.teadev.ooplike.service.PromoProvider;
import ru.teadev.ooplike.service.SubscriptionExtractor;

@RequiredArgsConstructor
public class BuySubscriptionUseCase {

    private final ClientExtractor clientExtractor;
    private final SubscriptionExtractor subscriptionExtractor;
    private final ClientPersister clientPersister;
    private final PromoProvider promoProvider;
    private final PaymentProvider paymentProvider;

    @SuppressWarnings("unused")
    public void execute(Order order) throws ClientNotExistException,
            SubscriptionNotAvailable, NotEnoughMoneyException, PaymentException {

        ClientId clientId = order.getClientId();

        Client client = clientExtractor.findClient(clientId)
                .orElseThrow(() -> new ClientNotExistException(clientId));

        Subscription subscription = subscriptionExtractor.findSubscription(order.getSubscriptionId())
                .orElseThrow(() -> new SubscriptionNotAvailable(order.getSubscriptionId()));


        client.buySubscription(subscription, promoProvider, paymentProvider);


        clientPersister.persist(client);
    }
}
