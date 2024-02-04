package ru.teadev.fp.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fp.entity.Client;
import ru.teadev.fp.entity.Subscription;

@RequiredArgsConstructor
public class SubscriptionService {

    public boolean isSubscriptionAvailable(Subscription subscription) {
        return true;
    }


    public void activateSubscription(Client client, Subscription subscription) {

    }
}
