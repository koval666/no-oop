package ru.teadev.nooop.fplike.entity;

import lombok.Data;

@Data
public class Order {

    private Client client;
    private Subscription subscription;
}
