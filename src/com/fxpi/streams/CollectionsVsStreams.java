package com.fxpi.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");

        // with collection its possible to re-iterate
        for(String name : names){
            System.out.println(name);
        }

        for(String name : names){
            System.out.println(name);
        }

        names.remove(0);

        System.out.println(names);

        //with streams its not possible
        Stream<String> stringStream = names.stream();
        stringStream.forEach(System.out::println);
       // stringStream.forEach(System.out::println);

    }
}
