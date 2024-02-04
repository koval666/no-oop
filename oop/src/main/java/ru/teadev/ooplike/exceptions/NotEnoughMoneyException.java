package ru.teadev.ooplike.exceptions;

import ru.teadev.ooplike.entity.ClientId;
import ru.teadev.ooplike.entity.Price;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(ClientId clientId,
                                   Price price) {
    }
}
