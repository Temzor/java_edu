package com.javastart.lesson2;

public class MainOperations {
    public static void main(String[] args) {
        byte typeByte;
        short typeShort;
        int typeInt;
        long typeLong;
        float typeFloat;
        double typeDouble;


        typeByte = 127;
        typeShort = 32767;
        typeInt = 2147483647;
        typeLong = 9223372036854775807L;
        typeFloat = 3.4123456f;
        typeDouble = 1.71112223334445556;

        double operationSum = typeDouble + typeLong;
        float operationSubtraction = typeLong - typeFloat;
        int operationMultiply = typeByte * typeShort;
        short operationDiv = (short) (typeShort / typeByte);
        byte operationRemainderOfTheDivision = (byte) (typeInt / typeByte);

        System.out.println("Operation Sum: " + operationSum);
        System.out.println("Operation Subtraction: " + operationSubtraction);
        System.out.println("Operation Multiply: " + operationMultiply);
        System.out.println("Operation Div: " + operationDiv);
        System.out.println("Operation Remainder Of The Division: " + operationRemainderOfTheDivision);

    }
}
