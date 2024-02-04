package ru.teadev.nooop.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.fplike.entity.Client;
import ru.teadev.nooop.fplike.entity.Price;
import ru.teadev.nooop.fplike.entity.Subscription;
import ru.teadev.nooop.fplike.exceptions.PaymentException;

@RequiredArgsConstructor
public class PaymentService {

    public void makePayment(Client client, Subscription subscription, Price price) throws PaymentException {

    }
}
