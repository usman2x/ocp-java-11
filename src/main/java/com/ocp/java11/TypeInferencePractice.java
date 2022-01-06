package com.ocp.java11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/**
 * var reserved type can be used to declare and initialize the variables inside the method block,
 * static block and non static block. it can't be used to declare class level variables, method arguments,
 * method return types and parameterized class.
 * Using var does not make java dynamically typed language, it's still a statically type language
 * as type infers at compile time and cannot be changed later.
 * <p>
 * Java has been referring to verbose language till date, all the releases after java 8 is designed to
 * reduce verbosity of java. var is also part of same chain, making code less verbose, no more redundant type
 * declarations.
 * Some times within small methods and loop explicit type is not that important but the name of the variable, var focuses on
 * important things not the formality.
 */

@FunctionalInterface
interface LambdaFunction {
    String execute(String str);
}

class SomeOtherClass {
    public static String initialize() {
        return "HelloWorld";
    }
}

public class TypeInferencePractice {

    {
        System.out.println("No Covid");
    }

    static {
        var str = "Hello World from static block 1";
        System.out.println(str);
    }

    public static void main(String[] args) {
        var str = "Hello World from main";
        System.out.println(str);

    }

    public static void legalUseCases(String[] args) {

        //Since var is reserved type and not a java keyword thus can be used as variable name
        var var = 123;

        var arr = new int[]{1};

        var arguments = args;
        System.out.println(arguments);

        //Variable declared with var can be reassigned, once it'll be inferred the type at compile time
        // you can reassign with the same type, remember java is still statically typed language.
        // make it final if you want a variable cannot be reassigned
        var str = "Hello World";
        str = "Hello World again";

//        final var str = "Hello World";

        for (var i = 0; i < args.length; i++) {
            System.out.println(i);
        }

        for (var i : args) {
            System.out.println(i);
        }

        LambdaFunction lambdaFunction1 = (String s) -> {
            return s.toLowerCase(Locale.ROOT);
        };

        var lambdaFunction2 = lambdaFunction1;

        var lambdaFunction3 = (LambdaFunction) (String s) -> {
            return s.toLowerCase(Locale.ROOT);
        };

        var thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Running Thread");
            }
        };

        // Following use case is legal but not recommended, as you can't guess the
        // type of variable until you see definition of initialize method.
        var legalButNotRecommended = SomeOtherClass.initialize();
    }

    // var usage with try-resource block
    static String readFirstLineFromFile(String path) throws IOException {
        try (var br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }

    public static void illegalUseCases() {
//        var is applicable only for local variables with initialization, It can't be used
//        with method return type, method arguments, member variables.

//        illegal, cannot infer type as using var without initialization
//        var str;

//        illegal, null is not a type in java, initialization required a type which compiler will infer at
//        compile time.
//        var str = null;

//        illegal, str is already inferred to type string and cannot be converted to Integer
//        var str = "";
//        str = 123;

//        Illegal, lambda expression requires an explicit type-target, type casting is required to make it legal
//        var lambdaFunction1 = (String s) -> {
//            return s.toLowerCase(Locale.ROOT);
//        };

//        Illegal, var is not allowed in compound declaration
//        var s1 = "S1", s2 = "S2";
    }
}

// https://www.youtube.com/watch?v=WWipb9qFRuo&ab_channel=OracleDevelopers