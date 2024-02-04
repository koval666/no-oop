package ru.teadev.fp.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fp.entity.Client;
import ru.teadev.fp.entity.Price;
import ru.teadev.fp.entity.Subscription;
import ru.teadev.fp.exceptions.PaymentException;

@RequiredArgsConstructor
public class PaymentService {

    public void makePayment(Client client, Subscription subscription, Price price) throws PaymentException {

    }
}
