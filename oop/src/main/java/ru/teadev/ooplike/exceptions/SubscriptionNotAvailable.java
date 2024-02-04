package ru.teadev.ooplike.exceptions;

import ru.teadev.ooplike.entity.SubscriptionId;

public class SubscriptionNotAvailable extends Exception {
    public SubscriptionNotAvailable(SubscriptionId subscriptionId) {
    }
}
