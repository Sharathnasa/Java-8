package com.fxpi.numericstreams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

    public static void main(String[] args) {
       int sum = IntStream.rangeClosed(1,50)
                .sum();
       System.out.println(sum);

       OptionalInt max = IntStream.rangeClosed(1,50).max();
       System.out.println(max.getAsInt());

        OptionalLong optionalLong = LongStream.rangeClosed(50, 100).min();
        System.out.println(optionalLong.getAsLong());

    }
}
