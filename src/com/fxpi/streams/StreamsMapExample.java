package com.fxpi.streams;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {
        return StudentDataBase.getAllStudents().stream() // stream of student
                //Student as input -> output is student name
                .map(Student::getName) // stream of string
                .map(String::toUpperCase) // this map is performing some operation on streams of input
                .collect(Collectors.toList()); // list of strings
    }

    public static Set<String> namesSet() {
        return StudentDataBase.getAllStudents().stream() // stream of student
                //Student as input -> output is student name
                .map(Student::getName) // stream of string
                .map(String::toUpperCase) // this map is performing some operation on streams of input
                .collect(Collectors.toSet()); // list of strings
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
