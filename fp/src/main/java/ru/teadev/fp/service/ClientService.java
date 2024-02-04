package ru.teadev.fp.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fp.entity.Client;
import ru.teadev.fp.entity.Price;

@RequiredArgsConstructor
public class ClientService {

    public boolean isClientExist(Client client) {
        return true;
    }

    public boolean isEnoughMoney(Client client,
                                 Price price) {
        return true;
    }
}
