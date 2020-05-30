package com.fxpi.streams;

import com.fxpi.data.StudentDataBase;

public class StreamMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.9); // it means that all the student should match this condition
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0); // it means that any one of the student should match this condition
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 9.0); // it means that any one of the student should match this condition
    }

    public static void main(String[] args) {
        System.out.println("Result of All Match : " + allMatch());
        System.out.println("Result of any Match : " + anyMatch());
        System.out.println("Result of none Match : " + noneMatch());
    }
}
