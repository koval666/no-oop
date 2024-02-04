package ru.teadev.oop.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.oop.entity.Client;
import ru.teadev.oop.entity.ClientId;

import java.util.Optional;

@RequiredArgsConstructor
public class ClientExtractor {

    public Optional<Client> findClient(ClientId clientId) {
        return Optional.empty();
    }
}
