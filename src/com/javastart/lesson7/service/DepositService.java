package com.javastart.lesson7.service;

import com.javastart.lesson7.entity.Account;
import com.javastart.lesson7.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        System.out.println("Происходит операция пополнения счета, текущее значение счета: " + bill.getAmount());
        bill.setAmount(bill.getAmount() + amount);
        System.out.println("Пополнение завершено, новое значение счета: " + bill.getAmount());
    }
}
