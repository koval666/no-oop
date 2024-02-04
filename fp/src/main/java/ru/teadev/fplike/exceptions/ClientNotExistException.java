package ru.teadev.fplike.exceptions;

import ru.teadev.fplike.entity.Client;

public class ClientNotExistException extends Exception {
    public ClientNotExistException(Client client) {
    }
}
