package com.fxpi.streams;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName)) // sort the result by comparing the student name
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpa() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa)) // sort the result by comparing the student gpa
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGpaDesc() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())// sort the result by comparing the student gpa
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // this sorts the Student Object
        System.out.println(sortStudentByName());

        System.out.println("Students sorted by Name :");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Students sorted by GPA :");
        sortStudentByGpa().forEach(System.out::println);

        System.out.println("Students sorted by GPA DESC :");
        sortStudentByGpaDesc().forEach(System.out::println);
    }
}
