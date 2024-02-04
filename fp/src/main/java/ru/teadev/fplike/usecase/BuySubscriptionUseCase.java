package ru.teadev.fplike.usecase;

import lombok.RequiredArgsConstructor;
import ru.teadev.fplike.entity.Order;
import ru.teadev.fplike.exceptions.CantBuySubscriptionException;
import ru.teadev.fplike.exceptions.ClientNotExistException;
import ru.teadev.fplike.exceptions.NotEnoughMoneyException;
import ru.teadev.fplike.exceptions.PaymentException;
import ru.teadev.fplike.exceptions.SubscriptionNotAvailable;
import ru.teadev.fplike.service.OrderService;

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
