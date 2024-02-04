package ru.teadev.ooplike.exceptions;

import ru.teadev.ooplike.entity.ClientId;

public class ClientNotExistException extends Exception {
    public ClientNotExistException(ClientId clientId) {
    }
}
