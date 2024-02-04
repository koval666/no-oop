package ru.teadev.nooop.ooplike.entity;

import lombok.Data;

@Data
public class Subscription {

    private SubscriptionId id;
    private Price basePrice;
}
