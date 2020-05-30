package com.fxpi.streams;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(filterStudents());
        filterStudents().forEach(System.out::println);
    }
}
