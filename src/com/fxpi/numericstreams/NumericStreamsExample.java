package com.fxpi.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNNumbers(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (a, b) -> a + b);
    }

    public static int sumOfNNumbersIntStream(){
        return IntStream.rangeClosed(1,6) //1,2,3,4,5,6
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Sum of N Numbers : " + sumOfNNumbers(integerList));
        System.out.println("Sum of N Numbers using Numeric Stream: " + sumOfNNumbersIntStream());
    }
}
