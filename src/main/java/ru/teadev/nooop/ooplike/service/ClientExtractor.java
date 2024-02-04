package ru.teadev.nooop.ooplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.ooplike.entity.Client;
import ru.teadev.nooop.ooplike.entity.ClientId;

import java.util.Optional;

@RequiredArgsConstructor
public class ClientExtractor {

    public Optional<Client> findClient(ClientId clientId) {
        return Optional.empty();
    }
}
