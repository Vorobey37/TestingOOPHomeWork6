package org.example.princip3;

import java.math.BigDecimal;

public class Account {

    public BigDecimal ballance(String numberAccount){
        //логика
        return null;
    }

    public void refill(String numberAccount, BigDecimal sum){
        //логика
    }

    //данный метод нельзя выделять в родительском классе, т.к. не все наследники его реализуют, 3 принцип
//    public void payment(String numberAccount, BigDecimal sum){
//        //логика
//    }
}
