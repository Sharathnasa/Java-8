package com.fxpi.FucntionaInterfaces;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printStudents() {
        System.out.println("printStudents :");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities :");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); // consumer chain
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition :");

        List<Student> studentList = StudentDataBase.getAllStudents();
        // filtering students name and activities based on the grade level
        studentList.forEach((student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() > 3.9) {
                c3.andThen(c4).accept(student);
            }
        }));
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");
        printStudents();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
