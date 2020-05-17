package com.fxpi.MethodReference;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student.getActivities()));
    static Consumer<Student> studentConsumerActivities = (student -> System.out.println(student.getActivities()));

    static Consumer<Student> studentConsumerUsingMethodReference = (System.out::println);
    static Consumer<Student> studentConsumerActivitiesUsingMethodReference = (Student::printListOfActivities);

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(studentConsumer);
        StudentDataBase.getAllStudents().forEach(studentConsumerUsingMethodReference);

        StudentDataBase.getAllStudents().forEach(studentConsumerActivities);
        StudentDataBase.getAllStudents().forEach(studentConsumerActivitiesUsingMethodReference);
    }
}
