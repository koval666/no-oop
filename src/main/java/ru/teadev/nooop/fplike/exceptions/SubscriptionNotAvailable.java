package ru.teadev.nooop.fplike.exceptions;

import ru.teadev.nooop.fplike.entity.Subscription;

public class SubscriptionNotAvailable extends Exception {
    public SubscriptionNotAvailable(Subscription subscription) {
    }
}
