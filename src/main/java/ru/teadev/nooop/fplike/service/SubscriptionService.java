package ru.teadev.nooop.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.fplike.entity.Client;
import ru.teadev.nooop.fplike.entity.Subscription;

@RequiredArgsConstructor
public class SubscriptionService {

    public boolean isSubscriptionAvailable(Subscription subscription) {
        return true;
    }


    public void activateSubscription(Client client, Subscription subscription) {

    }
}
