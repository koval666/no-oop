package ru.teadev.nooop.ooplike.exceptions;

import ru.teadev.nooop.ooplike.entity.ClientId;

public class ClientNotExistException extends Exception {
    public ClientNotExistException(ClientId clientId) {
    }
}
