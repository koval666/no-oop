package ru.teadev.fp.exceptions;

import ru.teadev.fp.entity.Client;

public class ClientNotExistException extends Exception {
    public ClientNotExistException(Client client) {
    }
}
