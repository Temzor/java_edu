package com.javastart.lesson4;

import java.util.Scanner;

public class MainConstructor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int first;
        int second;

        System.out.print("Input first number: ");
        first = input.nextInt();

        System.out.print("Input second number: ");
        second = input.nextInt();

        System.out.println("Result sum: " + sum(first, second));
    }

    public static int sum(int first, int second) {
        return first + second;
    }
}
