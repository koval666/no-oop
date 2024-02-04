package ru.teadev.ooplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.ooplike.entity.ClientId;
import ru.teadev.ooplike.entity.Discount;
import ru.teadev.ooplike.entity.Price;
import ru.teadev.ooplike.entity.Subscription;

@RequiredArgsConstructor
public class PromoProvider {

    public Discount calculateDiscount(ClientId clientId, Subscription subscription) {
        return new Discount();
    }

    public Price applyDiscount(Price price, Discount discount) {
        return price;
    }
}
