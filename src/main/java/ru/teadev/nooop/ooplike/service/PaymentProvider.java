package ru.teadev.nooop.ooplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.ooplike.entity.ClientId;
import ru.teadev.nooop.ooplike.entity.Price;
import ru.teadev.nooop.ooplike.entity.Subscription;
import ru.teadev.nooop.ooplike.exceptions.PaymentException;

@RequiredArgsConstructor
public class PaymentProvider {

    public void makePayment(ClientId clientId, Subscription subscription, Price price) throws PaymentException {

    }
}
