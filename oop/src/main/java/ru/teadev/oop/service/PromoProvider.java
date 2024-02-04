package ru.teadev.oop.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.oop.entity.ClientId;
import ru.teadev.oop.entity.Discount;
import ru.teadev.oop.entity.Price;
import ru.teadev.oop.entity.Subscription;

@RequiredArgsConstructor
public class PromoProvider {

    public Discount calculateDiscount(ClientId clientId, Subscription subscription) {
        return new Discount();
    }

    public Price applyDiscount(Price price, Discount discount) {
        return price;
    }
}
