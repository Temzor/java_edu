package com.javastart.lesson2;

public class MainPrimitiveTypes {
    public static void main(String[] args) {
        byte typeByte;
        short typeShort;
        int typeInt;
        long typeLong;
        float typeFloat;
        double typeDouble;
        char typeChar;
        boolean typeBoolean;

        typeByte = 127;
        typeShort = 32767;
        typeInt = 2147483647;
        typeLong = 9223372036854775807L;
        typeFloat = 3.4123456f;
        typeDouble = 1.71112223334445556;
        typeChar = 'M';
        typeBoolean = false;

        System.out.println("Byte value is: " + typeByte);
        System.out.println("Short value is: " + typeShort);
        System.out.println("Int value is: " + typeInt);
        System.out.println("Long value is: " + typeLong);
        System.out.println("Float value is: " + typeFloat);
        System.out.println("Double value is: " + typeDouble);
        System.out.println("Char value is: " + typeChar);
        System.out.println("Boolean value is: " + typeBoolean);
    }
}
