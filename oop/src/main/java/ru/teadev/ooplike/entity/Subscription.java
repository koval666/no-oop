package ru.teadev.ooplike.entity;

import lombok.Data;

@Data
public class Subscription {

    private SubscriptionId id;
    private Price basePrice;
}
