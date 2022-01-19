package com.ocp.java11;

interface Animal {
    default void speak() {
        System.out.println("Speak");
    }

    static void listen() {
        System.out.println("Listen");
    }
}

public class Interfaces implements Animal {
    public static void main(String[] args) {
        Interfaces interfaces = new Interfaces();
        interfaces.speak();
        interfaces.listen();
    }

    public void speak() {
        System.out.println("Speaking");
    }

    static void listen() {
        System.out.println("Listening");
    }
}
