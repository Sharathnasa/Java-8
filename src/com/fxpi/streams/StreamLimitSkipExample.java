package com.fxpi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integers) {
        return integers.stream()
                .limit(2) // now it will take only first 2
                .reduce((a, b) -> a + b);
    }

    public static Optional<Integer> skip(List<Integer> integers) {
        return integers.stream()
                .skip(2) // now it will skip  first 2
                .reduce((a, b) -> a + b);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6, 7, 8, 9, 10);
        Optional<Integer> limitResult = limit(list);
        limitResult.ifPresent(System.out::println);
    }
}
