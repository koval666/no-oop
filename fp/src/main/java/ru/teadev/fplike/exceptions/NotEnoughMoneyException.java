package ru.teadev.fplike.exceptions;

import ru.teadev.fplike.entity.Client;
import ru.teadev.fplike.entity.Price;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(Client client,
                                   Price price) {
    }
}
