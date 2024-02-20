package org.example.princip3;

import java.math.BigDecimal;

public class DepositAccount extends Account{//поддерживает только родительские методы, 3 принцип
    @Override
    public BigDecimal ballance(String numberAccount) {
        //логика
        return null;
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        //логика
    }

}
