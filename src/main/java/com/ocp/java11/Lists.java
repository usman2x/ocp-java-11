package com.ocp.java11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// List -> Collection
// Ordered collection of objects
// Since it preserves the order, can access specific object or insert at specific position
// Duplicate values are allowed
// Since List is an interface, we have to create implementation class
public class Lists {
    public static void main(String[] args) {
        linkedList();
    }

    private static void linkedList() {
        LinkedList<String> linkedList = new LinkedList<>();

        //Adding elements
        linkedList.add("One");
        linkedList.addFirst("Zero");
        linkedList.addLast("Two");
        linkedList.add(0, "0");
        linkedList.push("-2");


        //Updating elements
        linkedList.set(0, "-1");

//        linkedList.removeFirst();
//        linkedList.remove();
//        linkedList.pop();
//        linkedList.poll();


        System.out.println(linkedList);

    }

    // ArrayList is not synchronized, use Vector for thread safety
    private static void arrayList() {
        // Adding
        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add(list1.size(), "Two");

        // Add at specified index, Shift the index of replacing element and subsequent elements to the right
        list1.add(0, "0");

        List<String> list2 = new ArrayList<>();
        list2.add("Three");
        list2.add("Four");
        list1.addAll(list1.size(), list2);

        // Updating
        list1.set(0, "Zero");

        // Deleting
        list1.remove(0);
        list1.remove("Four");
        list1.removeAll(list2);

        list1.removeIf(s -> s.equals("Two"));

        System.out.println(list1);
    }

    private static void listInitialization() {
        List<String> list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        List<?> list3 = new ArrayList<>();
        List<? extends String> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();
        //Double braces initialization
        List<String> list6 = new ArrayList<>() {{
            add("S1");
            add("S2");
        }};
    }

}
