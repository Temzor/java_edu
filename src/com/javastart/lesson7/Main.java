package com.javastart.lesson7;

import com.javastart.lesson7.entity.Account;
import com.javastart.lesson7.entity.Bill;
import com.javastart.lesson7.entity.Person;
import com.javastart.lesson7.service.DepositService;
import com.javastart.lesson7.service.PaymentService;
import com.javastart.lesson7.service.TransferService;

public class Main {
    public static void main(String[] args) {
        Person dmitriiPerson = new Person("Dmitrii", "Raskazov", 32181232);
        Bill dmitriiBill = new Bill(15000);
        Account dmitriiAccount = new Account(dmitriiPerson, dmitriiBill);

        Person vasyaPerson = new Person("Vasya", "Bukashkin", 32187895);
        Bill vasyaBill = new Bill(35000);
        Account vasyaAccount = new Account(vasyaPerson, vasyaBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(dmitriiAccount, 1000);
        paymentService.pay(vasyaAccount, 5000);

        DepositService depositService = new DepositService();
        depositService.deposit(dmitriiAccount, 18000);
        depositService.deposit(vasyaAccount, 13000);

        TransferService transferService = new TransferService();
        transferService.transfer(dmitriiAccount, vasyaAccount, 60000);
        transferService.transfer(vasyaAccount, dmitriiAccount, 9000);
    }
}
