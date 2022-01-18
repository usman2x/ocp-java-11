package com.ocp.java11;


public class ControlFlow {

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhileLoop();
    }

    private static void whileLoop() {
        int i = 0;
        while (i <= 5) {
            System.out.println("Hello world in while loop");
            i++;
        }
    }

    private static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println("Hello World in do while loop.");
            i++;
        } while (i <= 5);
    }

    private static void forLoop() {
        for (int initialization = 0, anotherInitialization = 0; initialization <= 5; initialization++) {
            System.out.println("Hello World in for loop.");
        }
    }

}
