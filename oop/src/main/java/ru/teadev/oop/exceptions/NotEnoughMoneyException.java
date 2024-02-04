package ru.teadev.oop.exceptions;

import ru.teadev.oop.entity.ClientId;
import ru.teadev.oop.entity.Price;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(ClientId clientId,
                                   Price price) {
    }
}
