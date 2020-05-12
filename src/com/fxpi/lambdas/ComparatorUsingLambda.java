package com.fxpi.lambdas;

import java.util.Comparator;

public class ComparatorUsingLambda {

    public static void main(String[] args) {

        /**
         * Prior Java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> if both values are same
                // 1 -> o1>o2
                //-1 -> o1<o2
            }
        };

        System.out.println("Result of Comparator is :" + comparator.compare(3, 2));


        /**
         * Lambda way
         */

        Comparator<Integer> comparatorLambda = (a, b) -> a.compareTo(b);

        System.out.println("Result of Comparator using Lambdas :" + comparatorLambda.compare(3, 2));
    }


}
