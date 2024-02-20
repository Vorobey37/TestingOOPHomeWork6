package org.example.princip3;

import java.math.BigDecimal;

public class SallaryAccount extends PaymentAccount{//т.к. родительский класс поддерживает метод payment(), 3 принцип

    @Override
    public BigDecimal ballance(String numberAccount) {
        //логика
        return null;
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        //логика
    }

    @Override
    public void payment(String numberAccount, BigDecimal sum) {
        //логика
    }
}
