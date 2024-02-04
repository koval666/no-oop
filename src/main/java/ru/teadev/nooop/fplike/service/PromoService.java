package ru.teadev.nooop.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.fplike.entity.Client;
import ru.teadev.nooop.fplike.entity.Discount;
import ru.teadev.nooop.fplike.entity.Price;
import ru.teadev.nooop.fplike.entity.Subscription;

@RequiredArgsConstructor
public class PromoService {

    public Discount getDiscount(Client client, Subscription subscription) {
        return new Discount();
    }

    public Price applyDiscount(Price price, Discount discount) {
        return price;
    }
}
