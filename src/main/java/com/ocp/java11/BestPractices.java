package com.ocp.java11;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

public class BestPractices {
    public static void main(String[] args) {
        stringComparison();
        predicateComparison();
    }

    private static void predicateComparison() {
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Predicate<Integer> greaterThanZeroPredicate = x -> x > 0;

        var integers = Arrays.asList(1, 2, 42, 65, 87, 3, 2, 56);

        integers.stream()
                .filter(evenPredicate)
                .forEach(System.out::print);

        System.out.println();

        integers.stream()
                .filter(evenPredicate.and(greaterThanZeroPredicate))
                .forEach(System.out::print);

        System.out.println();
    }

    private static void stringComparison() {
        String s1 = "s1";
        String s2 = "s2";
        boolean result1 = s1.equals(s2);
        // This should not be the ideal case of string comparison,
        // nullPointerException if s1 is null

        // Following will check all edge cases
        boolean result2 = Objects.equals(s1, s2);
    }

}
