package com.javastart.lesson4;

public class MainSwitchCase {
    public static void main(String[] args) {
        printDayOfWeek(5);
    }
    public static void printDayOfWeek (int dayNumber) {
        switch (dayNumber) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> throw new IllegalStateException("Unexpected value: " + dayNumber);
        }
    }
}
