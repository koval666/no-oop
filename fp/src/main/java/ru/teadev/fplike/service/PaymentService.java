package ru.teadev.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fplike.entity.Client;
import ru.teadev.fplike.entity.Price;
import ru.teadev.fplike.entity.Subscription;
import ru.teadev.fplike.exceptions.PaymentException;

@RequiredArgsConstructor
public class PaymentService {

    public void makePayment(Client client, Subscription subscription, Price price) throws PaymentException {

    }
}
