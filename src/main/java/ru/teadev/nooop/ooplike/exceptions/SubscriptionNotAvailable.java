package ru.teadev.nooop.ooplike.exceptions;

import ru.teadev.nooop.ooplike.entity.SubscriptionId;

public class SubscriptionNotAvailable extends Exception {
    public SubscriptionNotAvailable(SubscriptionId subscriptionId) {
    }
}
