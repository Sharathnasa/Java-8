package com.fxpi.FucntionaInterfaces;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    public static Predicate<Student> studentGradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;
    public static Predicate<Student> studentGpaLevelPredicate = (student) -> student.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {

        System.out.println("filterStudentByGradeLevel :");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if (studentGradeLevelPredicate.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpa() {
        System.out.println("filterStudentByGpa :");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if (studentGpaLevelPredicate.test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void filterStudents() {
        System.out.println("filterStudents :");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if (studentGradeLevelPredicate.and(studentGpaLevelPredicate).test(student)) {
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }
}
