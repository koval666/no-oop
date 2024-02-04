package ru.teadev.nooop.fplike.exceptions;

import ru.teadev.nooop.fplike.entity.Client;
import ru.teadev.nooop.fplike.entity.Price;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(Client client,
                                   Price price) {
    }
}
