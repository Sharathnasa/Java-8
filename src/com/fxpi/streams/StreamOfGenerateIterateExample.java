package com.fxpi.streams;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("adam", "dan", "julie");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, x -> x * 2)
                .limit(10)//this is very limit comes in handy
                .forEach(System.out::println);

        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(10)//this is very limit comes in handy
                .forEach(System.out::println);
    }
}
