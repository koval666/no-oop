package ru.teadev.oop.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.oop.entity.ClientId;
import ru.teadev.oop.entity.Price;
import ru.teadev.oop.entity.Subscription;
import ru.teadev.oop.exceptions.PaymentException;

@RequiredArgsConstructor
public class PaymentProvider {

    public void makePayment(ClientId clientId, Subscription subscription, Price price) throws PaymentException {

    }
}
