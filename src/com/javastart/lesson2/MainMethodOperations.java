package com.javastart.lesson2;

public class MainMethodOperations {
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
        byte operationRemainderOfTheDivision = (byte) (typeInt % typeByte);

        System.out.println("Operation Sum: " + operationSum);
        System.out.println("Operation Subtraction: " + operationSubtraction);
        System.out.println("Operation Multiply: " + operationMultiply);
        System.out.println("Operation Div: " + operationDiv);
        System.out.println("Operation Remainder Of The Division: " + operationRemainderOfTheDivision);

        operationSumOfDoubleLong(typeDouble, typeLong);
        operationSubtractionOfLongFloat(typeLong, typeFloat);
        operationMultiplyOfByteShort(typeByte, typeShort);
        operationDivOfByteShort(typeByte, typeShort);
        operationRemainderOfTheDivisionOfIntByte(typeInt,typeByte);

    }
    public static void operationSumOfDoubleLong(double typeDouble, long typeLong) {
        System.out.println("Operation Sum of method: " + (typeDouble + typeLong));
    }
    public static void operationSubtractionOfLongFloat(long typeLong, float typeFloat) {
        System.out.println("Operation Subtraction of method: " + (typeLong - typeFloat));
    }
    public static void operationMultiplyOfByteShort(byte typeByte, short typeShort) {
        System.out.println("Operation Multiply of method: " + (typeByte + typeShort));
    }
    public static void operationDivOfByteShort(byte typeByte, short typeShort) {
        System.out.println("Operation Div of method: " + (typeShort / typeByte));
    }
    public static void operationRemainderOfTheDivisionOfIntByte(int typeInt, byte typeByte) {
        System.out.println("Operation Remainder Of The Division for method: " + (typeInt % typeByte));
    }
}
