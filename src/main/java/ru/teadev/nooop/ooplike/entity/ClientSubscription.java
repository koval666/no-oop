package ru.teadev.nooop.ooplike.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ClientSubscription {

    private SubscriptionId subscriptionId;

}
