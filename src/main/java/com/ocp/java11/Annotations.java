package com.ocp.java11;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

/**
 * Java annotations are a mechanism for adding metadata information to our source code,
 * It does not reflect on the execution of code.
 * Annotations can be applied to declarations: declarations of classes, fields, methods, and other program elements
 * It can be used for number of reasons
 * 1- Information for the compile
 * 2- Compile-time or Deployment-time processing
 * 3- Runtime processing
 */

// In the absence of the default value makes the field required, provide default value if you want to keep it
// optional.
// Attribute values of the annotation must be compile-time constant
@Target(ElementType.TYPE)
@interface Author {
    String name();

    long date() default 1642478298071L;
}

@Target(ElementType.METHOD)
@interface JUsmanTest {
    long date();

    long timeOut() default 60000L;
}

@Repeatable(Alerts.class)
@interface Alert {
    String role();
}

@interface Alerts {
    Alert[] value();
}

@Author(name = "Usman")
interface BaseAnnotation {
    void dummyMethod();
}

//Repeatable Annotations
@Alert(role = "Developer")
@Alert(role = "Manager")
public class Annotations implements BaseAnnotation {
    private static final long date = 1642478298071L;

    public static void main(String[] args) {
        systemAnnotations();
    }

    @JUsmanTest(date = date, timeOut = 12)
    private void unitTestAnnotation() {

    }

    @SuppressWarnings("unchecked")
    private static void systemAnnotations() {

    }

    @Override
    public void dummyMethod() {

    }
}

