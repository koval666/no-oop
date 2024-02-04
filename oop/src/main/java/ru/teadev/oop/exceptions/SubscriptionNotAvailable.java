package ru.teadev.oop.exceptions;

import ru.teadev.oop.entity.SubscriptionId;

public class SubscriptionNotAvailable extends Exception {
    public SubscriptionNotAvailable(SubscriptionId subscriptionId) {
    }
}
