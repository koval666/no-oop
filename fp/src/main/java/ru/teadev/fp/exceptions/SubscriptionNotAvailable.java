package ru.teadev.fp.exceptions;

import ru.teadev.fp.entity.Subscription;

public class SubscriptionNotAvailable extends Exception {
    public SubscriptionNotAvailable(Subscription subscription) {
    }
}
