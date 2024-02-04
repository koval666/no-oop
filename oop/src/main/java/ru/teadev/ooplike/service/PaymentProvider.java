package ru.teadev.ooplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.ooplike.entity.ClientId;
import ru.teadev.ooplike.entity.Price;
import ru.teadev.ooplike.entity.Subscription;
import ru.teadev.ooplike.exceptions.PaymentException;

@RequiredArgsConstructor
public class PaymentProvider {

    public void makePayment(ClientId clientId, Subscription subscription, Price price) throws PaymentException {

    }
}
