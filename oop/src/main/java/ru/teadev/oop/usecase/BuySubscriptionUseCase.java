package ru.teadev.oop.usecase;

import lombok.RequiredArgsConstructor;
import ru.teadev.oop.entity.Client;
import ru.teadev.oop.entity.ClientId;
import ru.teadev.oop.entity.Order;
import ru.teadev.oop.entity.Subscription;
import ru.teadev.oop.entity.SubscriptionId;
import ru.teadev.oop.exceptions.ClientNotExistException;
import ru.teadev.oop.exceptions.NotEnoughMoneyException;
import ru.teadev.oop.exceptions.PaymentException;
import ru.teadev.oop.exceptions.SubscriptionNotAvailable;
import ru.teadev.oop.service.ClientExtractor;
import ru.teadev.oop.service.ClientPersister;
import ru.teadev.oop.service.PaymentProvider;
import ru.teadev.oop.service.PromoProvider;
import ru.teadev.oop.service.SubscriptionExtractor;

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

        SubscriptionId subscriptionId = order.getSubscriptionId();
        Subscription subscription = subscriptionExtractor.findSubscription(subscriptionId)
                .orElseThrow(() -> new SubscriptionNotAvailable(subscriptionId));


        client.buySubscription(subscription, promoProvider, paymentProvider);


        clientPersister.persist(client);
    }
}
