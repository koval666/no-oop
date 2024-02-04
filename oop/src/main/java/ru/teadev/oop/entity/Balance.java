package ru.teadev.oop.entity;

import lombok.Data;

@Data
public class Balance {
    public boolean moreOrEqual(Price price) {
        return true;
    }

    public Balance spend(Price price) {
        return new Balance();
    }
}
