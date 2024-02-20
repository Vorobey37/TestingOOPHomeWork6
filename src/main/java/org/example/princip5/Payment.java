package org.example.princip5;

import java.math.BigDecimal;

//Связующий интерфейс, 5 принцип
public interface Payment {

    void doTransaction(BigDecimal amount);
}
