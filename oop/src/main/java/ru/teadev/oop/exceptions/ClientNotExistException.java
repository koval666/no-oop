package ru.teadev.oop.exceptions;

import ru.teadev.oop.entity.ClientId;

public class ClientNotExistException extends Exception {
    public ClientNotExistException(ClientId clientId) {
    }
}
