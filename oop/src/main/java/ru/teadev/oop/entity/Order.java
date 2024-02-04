package ru.teadev.oop.entity;

import lombok.Data;

@Data
public class Order {

    private ClientId clientId;
    private SubscriptionId subscriptionId;
}
