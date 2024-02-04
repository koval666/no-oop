package ru.teadev.nooop.ooplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.ooplike.entity.Subscription;
import ru.teadev.nooop.ooplike.entity.SubscriptionId;

import java.util.Optional;

@RequiredArgsConstructor
public class SubscriptionExtractor {

    public Optional<Subscription> findSubscription(SubscriptionId subscriptionId) {
        return Optional.empty();
    }
}
