package com.fxpi.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1, 5)
                .mapToObj((i) -> { // here we converting to Integer, like this we can convert to any other objects
                    return new Integer(i);
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(mapToObj());
    }
}
