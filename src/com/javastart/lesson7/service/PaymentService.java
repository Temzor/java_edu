package com.javastart.lesson7.service;

import com.javastart.lesson7.entity.Account;
import com.javastart.lesson7.entity.Bill;

public class PaymentService {

    public void pay(Account account, int amount) {
        Bill bill = account.getBill();
        if (bill.getAmount() < amount) {
            System.out.println("Платеж не возможен, недостаточно средств");
        } else {
            System.out.println("Происходит операция платежа, текущее значение счета: " + bill.getAmount());
            bill.setAmount(bill.getAmount() - amount);
            System.out.println("Платеж завершен, новое значение счета: " + bill.getAmount());

        }
    }
}
