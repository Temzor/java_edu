package com.javastart.lesson3;

import java.util.Scanner;

public class MainBooleanLogic {
    public static void main(String[] args) {
        Scanner inputFromLine = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        String inputFirstNumber = "Введите первое число: ";
        String inputSecondNumber = "Введите второе число: ";
        String firstIsBigger = "Первое число больше";
        String secondIsBigger = "Второе число больше";
        String numbersAreEquals = "Числа равны";

        System.out.print(inputFirstNumber);
        firstNumber = inputFromLine.nextInt();

        System.out.print(inputSecondNumber);
        secondNumber = inputFromLine.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstIsBigger);
        } else if (firstNumber < secondNumber) {
            System.out.println(secondIsBigger);
        } else {
            System.out.println(numbersAreEquals);
        }
    }
}
