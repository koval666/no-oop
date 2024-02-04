package ru.teadev.oop.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.oop.entity.Subscription;
import ru.teadev.oop.entity.SubscriptionId;

import java.util.Optional;

@RequiredArgsConstructor
public class SubscriptionExtractor {

    public Optional<Subscription> findSubscription(SubscriptionId subscriptionId) {
        return Optional.empty();
    }
}
