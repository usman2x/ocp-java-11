package com.ocp.java11;

// type comparison of primitive types

/**
 * Category 1: boolean, byte, short, int, long
 * Category 2: float, double
 * Category 3: char
 * Widening conversions (Implicit casting)
 * Narrowing Conversions (Explicit Casting)
 */
public class PrimitivesDataTypePractice {
    private static int intDefaultValue;
    private static char charDefaultValue;

    public static void main(String[] args) {
        byteType();
        shortType();
    }

    // boolean, 1 bit, 0 or 1
    public static void booleanType() {
        boolean b = true;
    }

    // byte, 8 bits, -128 - 127
    // can also holds decimal integers, binary, hexadecimal up to its limit
    // can't be initialized with value exceeds the limit, compilation error
    public static void byteType() {
        byte decimal = 0;
        byte bits = 0b1010101;
        byte hexaDecimal = 0x1F;

        byte b = 127;
        System.out.println(++b);
    }

    // short, 16 bits, -32768 - 32767
    // can also holds decimal integers, binary, hexadecimal up to its limit
    // can't be initialized with value exceeds the limit, compilation error
    // overflow happens when limit exceeds
    public static void shortType() {
        short decimal = 32767;
        System.out.println(++decimal);
    }

    // int, 32 bits, 0x80000000 - 0x7fffffff
    // can also holds decimal integers, binary, hexadecimal up to its limit
    // Numeric overflow warning when initialized with value exceeding the limits
    public static void intType() {
        int decimal = Integer.MIN_VALUE - 1;
    }

    // long, 64 bits, 0x8000000000000000L - 0x7fffffffffffffffL
    // can also holds decimal integers, binary, hexadecimal up to its limit
    // Numeric overflow warning when initialized with value exceeding the limits
    // Best practice is to place L at the end of long literal, otherwise it will consider as
    // int and if decimal exceeds the integer limit, it will give you an error
    public static void longType() {
        long decimal = 144354646445L;
    }

    //float, 32 bits floating point
    public static void floatType() {
        float f = Float.MAX_VALUE;
    }

    private static void explicitCasting() {
        int a = 127 * 2;
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
