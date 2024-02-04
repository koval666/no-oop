package ru.teadev.fp.exceptions;

import ru.teadev.fp.entity.Client;
import ru.teadev.fp.entity.Price;

public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(Client client,
                                   Price price) {
    }
}
