package com.fxpi.streams;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static List<String> printActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map((Student::getActivities)) // stream of list of string
                .flatMap(List::stream)// Stream<String, convert List<String> to Stream of String
                .distinct() // gives unique
                .sorted() // sorted alphabetical order naturally
                .collect(Collectors.toList());
    }

    public static long printActivitiesCount() {
        return StudentDataBase.getAllStudents().stream()
                .map((Student::getActivities)) // stream of list of string
                .flatMap(List::stream)// Stream<String, convert List<String> to Stream of String
                .distinct() // gives unique
                .count();
    }

    public static void main(String[] args) {

        System.out.println(printActivities());
        System.out.println(printActivitiesCount());
    }
}
