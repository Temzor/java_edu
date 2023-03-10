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
            array[i] = random.nextInt(100);
        }

        System.out.print("Enter to find number: ");
        int findNumber = input.nextInt();

        for (int i : array) {
            if (i == findNumber) {
                System.out.println("Number is found!");
                break;
            }
        }
        System.out.println("Number is not found!");

        System.out.println("Max number in array is: " + maxNumber(array));
    }

    public static int maxNumber(int[] array) {
        int result = array[0];
        for (int i : array) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }
}
