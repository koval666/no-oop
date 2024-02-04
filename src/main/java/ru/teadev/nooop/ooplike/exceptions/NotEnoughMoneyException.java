package ru.teadev.nooop.ooplike.exceptions;

import ru.teadev.nooop.ooplike.entity.ClientId;
import ru.teadev.nooop.ooplike.entity.Price;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(ClientId clientId,
                                   Price price) {
    }
}
