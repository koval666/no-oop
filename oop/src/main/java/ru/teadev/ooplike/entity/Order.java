package ru.teadev.ooplike.entity;

import lombok.Data;

@Data
public class Order {

    private ClientId clientId;
    private SubscriptionId subscriptionId;
}
