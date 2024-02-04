package ru.teadev.nooop.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.fplike.entity.Client;
import ru.teadev.nooop.fplike.entity.Price;

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
