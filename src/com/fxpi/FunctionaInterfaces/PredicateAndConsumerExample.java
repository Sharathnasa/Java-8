package com.fxpi.FunctionaInterfaces;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> studentPredicateGrade = (student) -> student.getGradeLevel() >= 3;
    Predicate<Student> studentPredicateGpa = (student) -> student.getGpa() >= 3.9;

    BiConsumer<String, List<String>> listBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student -> {
        if (studentPredicateGrade.and(studentPredicateGpa).test(student))
            listBiConsumer.accept(student.getName(), student.getActivities());
    });

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);

    }
}
