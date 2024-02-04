package ru.teadev.fp.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fp.entity.Client;
import ru.teadev.fp.entity.Discount;
import ru.teadev.fp.entity.Price;
import ru.teadev.fp.entity.Subscription;

@RequiredArgsConstructor
public class PromoService {

    public Discount calculateDiscount(Client client, Subscription subscription) {
        return new Discount();
    }

    public Price applyDiscount(Price price, Discount discount) {
        return price;
    }
}
