package ru.teadev.nooop.ooplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.ooplike.entity.ClientId;
import ru.teadev.nooop.ooplike.entity.Discount;
import ru.teadev.nooop.ooplike.entity.Price;
import ru.teadev.nooop.ooplike.entity.Subscription;

@RequiredArgsConstructor
public class PromoProvider {

    public Discount calculateDiscount(ClientId clientId, Subscription subscription) {
        return new Discount();
    }

    public Price applyDiscount(Price price, Discount discount) {
        return price;
    }
}
