package com.javastart.lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter length array: ");
        int[] array = new int[input.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        System.out.print("Enter find number: ");
        int findNumber = input.nextInt();

        for (int i : array) {
            if (i == findNumber) {
                System.out.println("Number is fined!");
                break;
            }
        }
        System.out.println("Number is not found!");
    }
}
