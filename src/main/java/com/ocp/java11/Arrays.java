package com.ocp.java11;

public class Arrays {
    public static void main(String[] args) {
        arrayTricks();
    }

    private static void arrayTricks() {
        int[] arr = new int[5];

        updateArrayValues(arr);
        printArray(arr);

        updateArrayReferences(arr);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void updateArrayValues(int[] arr) {
        arr[0] = 1;
        arr[4] = 2;
    }

    private static void updateArrayReferences(int[] arr) {
        arr = new int[10];
        updateArrayValues(arr);
    }

    private static void arrayInitialization() {
        // Array creation with size
        int[] arr1 = new int[4];
        // Array initialization (creation and initialization) within single line, Array size
        // is determined by the number of comma separated values given in curly braces
        int[] arr2 = new int[]{};
        int[] arr3 = new int[]{1};
        // or shorthand method
        int[] arr4 = {1, 2, 3};

        // Array can be initialized with indices
        arr1[0] = 1;

        // Without explicitly initialize array, by default values will be the same as of
        // type value by default
        int[] arr5 = new int[5];
        for (int i : arr5) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        Object[] arr6 = new Object[5];
        for (Object o : arr6) {
            System.out.print(o + " ");
        }
        System.out.println();
        // Once array is created with size, it can't be changed later
        // referring array value with index >= array length OR index < 0 will cause
        // ArrayIndexOutOfBoundsException
        System.out.println(arr1[arr1.length]);

    }
}
