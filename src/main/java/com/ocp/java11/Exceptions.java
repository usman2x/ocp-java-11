package com.ocp.java11;

public class Exceptions {
    public static void main(String[] args) {
        uncheckedExceptionCaller();
    }

    private static void uncheckedExceptionCaller() throws ArithmeticException {
        uncheckedException2();
    }

    private static void uncheckedException() throws Error {
        try {
            int result = 2 / 5;
            System.out.println(result);
            throw new Error();
        } catch (ArithmeticException e) {
            System.out.println("Catch Exception " + e.getLocalizedMessage());
            throw e;
        } finally {
            System.out.println("finally");
            return;
        }
    }

    private static void uncheckedException2() throws Error {
        try {
            int result = 1 / 0;
            System.out.println(result);
            throw new Error();
        } catch (ArithmeticException e) {
            System.out.println("Catch Exception " + e.getLocalizedMessage());
            System.exit(1);
        } finally {
            System.out.println("finally");
        }
    }

}
