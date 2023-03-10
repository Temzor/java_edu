package com.javastart.lesson1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int firstNumber = 10;
        int secondNumber = 5;
        int sum;
        int subtraction;
        int multiplication;
        int division;
        int remainderOfTheDivision;

        sum = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        multiplication = firstNumber * secondNumber;
        division = firstNumber / secondNumber;
        remainderOfTheDivision =  secondNumber % firstNumber;

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder of the division: " + remainderOfTheDivision);
    }
}
