package com.fxpi.lambdas;

import java.util.function.Consumer;

public class LambdaLocalVariables {

    // this i can use even in the lambda body since its an instance variable
    static int value =8;

    public static void main(String[] args) {
        int i = 0;

        // here we're getting the error, since we cannot use the locally declared variable
        // 1st restriction
        Consumer<Integer> consumer = (i1) -> {
            // this is also not allowed
            // int i =2;
            System.out.println(i);
        };

        // this is the local variable
        int value = 4;

        Consumer<Integer> c1 = (i2) -> {
            //this will give error if the value is local variable, let say i want to increase the value variable value like below
            // if its the instance variable, then no issue
            //value++;
            System.out.println(value + i2);
        };

        // error
        // value = 6;

        c1.accept(4);
    }
}
