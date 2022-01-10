package com.ocp.java11;

import java.util.Arrays;

/**
 * Wrapper classes: Each primitive type has it's wrapper class in java that supports work with generic classes.
 * Why do we use wrapper classes instead corresponding primitive types directly?
 * Java Collection framework works exclusively with objects, we cannot create primitive type List or any generic class.
 * Auto Boxing: Converting a primitive value (an int, for example) into an object of the corresponding wrapper class (Integer) is called autoboxing.
 * Unboxing: Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing.
 */
public class NonPrimitivesDataTypePractice {
    public static void main(String[] args) {
        unboxing();
    }

    public static void unboxing() {
//        Example 1
        Integer[] nonPrimitiveIntArray = new Integer[999999999];
        Arrays.fill(nonPrimitiveIntArray, 0);
        for (int i : nonPrimitiveIntArray) {
            System.out.println(i);
        }
//        Example 2
        unboxingMethod(nonPrimitiveIntArray[0]);
    }

    public static void autoboxing() {
//        Example 1
        int primitiveInt = 0;
        Integer nonPrimitiveInt = primitiveInt; // Compiler, behind the seen, creates the object and assign int (primitive) value to it.

//        Example 2, Traversing very large array will impact on performance, compiler will create n object behind the scene while autoboxing
        int[] primitiveIntArray = new int[999999999];

        for (Integer i : primitiveIntArray) {
            System.out.println(i);
        }

//        Example 3
        autoboxingMethod(primitiveInt);
    }

    private static void autoboxingMethod(Integer nonPrimitiveInt) {
        System.out.println("nonPrimitiveInt " + nonPrimitiveInt);
    }

    private static void unboxingMethod(int primitive) {
        System.out.println("primitive " + primitive);
    }
}
