package ru.teadev.nooop.fplike.exceptions;

import ru.teadev.nooop.fplike.entity.Client;

public class ClientNotExistException extends Exception {
    public ClientNotExistException(Client client) {
    }
}
