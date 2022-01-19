package com.ocp.java11;

/**
 * https://education.oracle.com/java-se-11-developer/pexam_1Z0-819
 */
public class Main {
    public static void main(String[] args) {
        tryConcurrentModificationException();
//        print(null);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(Integer i) {
        System.out.println(i);
    }

    private static void tryConcurrentModificationException() {

    }
}
