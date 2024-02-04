package ru.teadev.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fplike.entity.Client;
import ru.teadev.fplike.entity.Discount;
import ru.teadev.fplike.entity.Price;
import ru.teadev.fplike.entity.Subscription;

@RequiredArgsConstructor
public class PromoService {

    public Discount calculateDiscount(Client client, Subscription subscription) {
        return new Discount();
    }

    public Price applyDiscount(Price price, Discount discount) {
        return price;
    }
}
