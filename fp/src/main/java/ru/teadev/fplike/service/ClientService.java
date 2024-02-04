package ru.teadev.fplike.service;

import lombok.RequiredArgsConstructor;
import ru.teadev.fplike.entity.Client;
import ru.teadev.fplike.entity.Price;

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
