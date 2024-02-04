package ru.teadev.fp.usecase;

import lombok.RequiredArgsConstructor;
import ru.teadev.fp.entity.Order;
import ru.teadev.fp.exceptions.CantBuySubscriptionException;
import ru.teadev.fp.exceptions.ClientNotExistException;
import ru.teadev.fp.exceptions.NotEnoughMoneyException;
import ru.teadev.fp.exceptions.PaymentException;
import ru.teadev.fp.exceptions.SubscriptionNotAvailable;
import ru.teadev.fp.service.OrderService;

@RequiredArgsConstructor
public class BuySubscriptionUseCase {

    private final OrderService orderService;

    @SuppressWarnings("unused")
    public void execute(Order order) throws CantBuySubscriptionException {
        try {
            orderService.acceptSubscription(order);
        } catch (ClientNotExistException | SubscriptionNotAvailable | NotEnoughMoneyException | PaymentException e) {
            throw new CantBuySubscriptionException(e);
        }
    }

}
