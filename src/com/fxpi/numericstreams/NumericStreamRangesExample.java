package com.fxpi.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println(intStream.count());

        IntStream.range(1,50).forEach(value -> System.out.println(value+",")); // 1 to 49

        IntStream.rangeClosed(1,50).forEach(value -> System.out.println(value+",")); // 1 to 50

        // same for LongStream as well, DoubleStream doesn't support range and rangeClosed
    }
}
