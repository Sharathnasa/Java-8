package com.fxpi.FunctionaInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String, String> concatString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result is :" + function.apply("java8"));

        System.out.println("Result of andThen is :" + function.andThen(concatString).apply("java8"));

        System.out.println("Result of compose is :" + function.compose(concatString).apply("java8"));

        //difference between andThen and compose is that .andThen executes funtion first then the parameter function. Compose is reverse
    }
}
