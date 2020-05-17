package com.fxpi.MethodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> stringFunction = (s) -> s.toUpperCase();
    static Function<String, String> stringMethodReferenceFunction = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(stringFunction.apply("java8"));
        System.out.println(stringMethodReferenceFunction.apply("java8"));
    }
}
