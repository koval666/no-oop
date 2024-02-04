package ru.teadev.ooplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.ooplike.entity.Client;
import ru.teadev.ooplike.entity.ClientId;

import java.util.Optional;

@RequiredArgsConstructor
public class ClientExtractor {

    public Optional<Client> findClient(ClientId clientId) {
        return Optional.empty();
    }
}
