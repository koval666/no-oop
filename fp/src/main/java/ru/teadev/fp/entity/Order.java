package ru.teadev.fp.entity;

import lombok.Data;

@Data
public class Order {

    private Client client;
    private Subscription subscription;
}
