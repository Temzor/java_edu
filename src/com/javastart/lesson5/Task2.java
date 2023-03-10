package com.javastart.lesson5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.print("Operation: ");
        char operation = input.next().charAt(0);

        switch (operation) {
            case '+' -> System.out.println("Sum: " + (firstNumber + secondNumber));
            case '-' -> System.out.println("Subtraction: " + (firstNumber - secondNumber));
            case '*' -> System.out.println("Multiplayer: " + (firstNumber * secondNumber));
            case '/' -> System.out.println("Division: " + (firstNumber / secondNumber));
            case '%' -> System.out.println("Remainder of the division: " + (firstNumber / secondNumber));
            default -> throw new IllegalArgumentException("Element mot found");
        }
    }
}
