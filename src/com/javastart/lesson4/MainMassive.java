package com.javastart.lesson4;

import java.util.Scanner;

public class MainMassive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] massiveFirst = new int[10];
        int[] massiveSecond = new int[10];
        int[] massiveInitial = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        for (int i = 0; i < massiveFirst.length; i++) {
            massiveFirst[i] = i + 1;
            System.out.println("Element for index: " + i
                    + " Value put: " + massiveFirst[i]);
        }

        for (int i = 0; i < massiveSecond.length; i++) {
            massiveSecond[i] = input.nextInt();
        }

        printMass(massiveSecond);
        printMass(massiveInitial);
    }

    public static void printMass(int[] mass) {
        for (int element : mass) {
            System.out.println("Value put: " + element);
        }
    }
}
