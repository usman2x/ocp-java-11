package com.ocp.java11;

// type comparison of primitive types
//

/**
 * Widening conversions (Implicit casting)
 * Narrowing Conversions (Explicit Casting)
 */
public class PrimitivesDataTypePractice {
    private static int intDefaultValue;
    private static char charDefaultValue;

    public static void main(String[] args) {
        charExample();
        System.out.println(intDefaultValue);
        System.out.println(charDefaultValue);
    }

    private static void charExample() {
        boolean b = true;
    }


    /*
    int can also be use to store decimal, hexadecimal and binary number system.
     */
    private static void intExample() {

        int byteMaxValue = 0b11111111111111111111111111111111;
        int byteMinValue = -0b11111111111111111111111111111111;

        int decimalMaxValue = 999999999;
        int decimalMinValue = -999999999;

        int hexMaxValue = 0xFFFFFFFF;
        int hexMinValue = -0xFFFFFFFF;

        System.out.println(byteMaxValue);
    }


    private static void byteExamples() {
        byte b = 0b1111111;
        int ib = 0x12345F77;
        System.out.println(ib);
    }
}
