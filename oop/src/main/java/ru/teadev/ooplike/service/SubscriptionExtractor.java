package ru.teadev.ooplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.ooplike.entity.Subscription;
import ru.teadev.ooplike.entity.SubscriptionId;

import java.util.Optional;

@RequiredArgsConstructor
public class SubscriptionExtractor {

    public Optional<Subscription> findSubscription(SubscriptionId subscriptionId) {
        return Optional.empty();
    }
}
