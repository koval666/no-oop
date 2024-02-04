package ru.teadev.nooop.fplike.usecase;

import lombok.RequiredArgsConstructor;
import ru.teadev.nooop.fplike.entity.Order;
import ru.teadev.nooop.fplike.exceptions.CantBuySubscriptionException;
import ru.teadev.nooop.fplike.exceptions.ClientNotExistException;
import ru.teadev.nooop.fplike.exceptions.NotEnoughMoneyException;
import ru.teadev.nooop.fplike.exceptions.PaymentException;
import ru.teadev.nooop.fplike.exceptions.SubscriptionNotAvailable;
import ru.teadev.nooop.fplike.service.OrderService;

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
