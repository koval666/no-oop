package ru.teadev.nooop.ooplike.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import ru.teadev.nooop.ooplike.exceptions.NotEnoughMoneyException;
import ru.teadev.nooop.ooplike.exceptions.PaymentException;
import ru.teadev.nooop.ooplike.service.PaymentProvider;
import ru.teadev.nooop.ooplike.service.PromoProvider;

import java.util.Set;

@Data
@Setter(AccessLevel.PRIVATE)
public class Client {

    private ClientId id;

    private Set<ClientSubscription> subscriptions;

    private Balance balance;

    public void buySubscription(Subscription subscription,
                                PromoProvider promoProvider,
                                PaymentProvider paymentProvider) throws NotEnoughMoneyException, PaymentException {

        Discount discount = promoProvider.calculateDiscount(this.id, subscription);
        Price price = promoProvider.applyDiscount(subscription.getBasePrice(), discount);

        if (!this.canAfford(price)) {
            throw new NotEnoughMoneyException(this.id, price);
        }

        this.makePayment(subscription, price, paymentProvider);

        this.activateSubscription(subscription);
    }

    private boolean canAfford(Price price) {
        return getBalance().moreOrEqual(price);
    }

    private void makePayment(Subscription subscription,
                             Price price,
                             PaymentProvider paymentProvider) throws PaymentException {
        Balance newBalance = getBalance().spend(price);

        paymentProvider.makePayment(this.id, subscription, price);

        setBalance(newBalance);
    }

    private void activateSubscription(Subscription subscription) {
        this.subscriptions.add(new ClientSubscription().setSubscriptionId(subscription.getId()));
    }
}
