package org.example.princip4;

/**
 * Реализуем оплату по карте и телефону, 4 принцип
 */
public class InternetPaymentService implements PhonePayment, CardPayment{


    @Override
    public void payCreditCard() {
        //логика
    }

    @Override
    public void payPhoneNumber() {
        //логика
    }
}
