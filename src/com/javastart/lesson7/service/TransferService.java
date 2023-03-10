package com.javastart.lesson7.service;

import com.javastart.lesson7.entity.Account;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount) {
        if (accountFrom.getBill().getAmount() < amount) {
            System.out.println("Перевод не возможен, не достаточно средств");
        } else {
            System.out.println("Происходит перевод средств с аккаунта - "
                    + accountFrom.getAccountHolder().getFirstName() + "(" + accountFrom.getBill().getAmount()
                    + "), на аккаунт - " + accountTo.getAccountHolder().getFirstName()
                    + "(" + accountTo.getBill().getAmount() + ")");
            accountFrom.getBill().setAmount(accountFrom.getBill().getAmount() - amount);
            accountTo.getBill().setAmount(accountTo.getBill().getAmount() + amount);
            System.out.println("Перевод успешно завершен");
        }
    }
}
