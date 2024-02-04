package ru.teadev.nooop.ooplike.entity;

import lombok.Data;

@Data
public class Order {

    private ClientId clientId;
    private SubscriptionId subscriptionId;
}
