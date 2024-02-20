package org.example.princip5;

import java.math.BigDecimal;

//Класс не связан с конкретным типом оплаты, 5 принцип
//Можем использовать в полях (принимать в конструктор) любой класс, имплементированный от Payment
public class Shop {

    private Payment payment;

    public Shop(Payment payment) {
        this.payment = payment;
    }

    public void doPayment(Object order, BigDecimal amound){
        payment.doTransaction(amound);
    }
}
