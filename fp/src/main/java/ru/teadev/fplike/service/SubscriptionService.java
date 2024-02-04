package ru.teadev.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fplike.entity.Client;
import ru.teadev.fplike.entity.Subscription;

@RequiredArgsConstructor
public class SubscriptionService {

    public boolean isSubscriptionAvailable(Subscription subscription) {
        return true;
    }


    public void activateSubscription(Client client, Subscription subscription) {

    }
}
