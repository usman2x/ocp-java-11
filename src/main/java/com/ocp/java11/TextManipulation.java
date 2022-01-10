package com.ocp.java11;

public class TextManipulation {
    public static void main(String[] args) {
        stringBuilderExample();
    }

    //StringBuilder is not guaranteed to be threadsafe and best replacement for StringBuffer in single threaded environment.
    public static void stringBuilderExample() {
        StringBuilder string = new StringBuilder("Hello World!");
        string.append(2);
        string.append('c');
        string.append(1L);
        string.append(1.2);
        string.append(1.43534D);
        string.append(0x1);
        string.append(0b1);
        string.append(true);

        System.out.println(string);
    }

    public static void StringBufferExample() {
        Thread[] threadList = new Thread[10];
        for (int i = 0; i < threadList.length; i++) {
            threadList[i] = new Thread(() -> {
                
            });
        }
    }
}
