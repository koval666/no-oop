package ru.teadev.fplike.exceptions;

import ru.teadev.fplike.entity.Subscription;

public class SubscriptionNotAvailable extends Exception {
    public SubscriptionNotAvailable(Subscription subscription) {
    }
}
