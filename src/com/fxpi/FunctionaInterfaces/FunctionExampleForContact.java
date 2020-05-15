package com.fxpi.FunctionaInterfaces;

public class FunctionExampleForContact {

    public static String performContact(String string) {
        return FunctionExample.concatString.apply(string);
    }

    public static void main(String[] args) {
        String result = performContact("hello");
        System.out.println("Result: " + result);
    }
}
