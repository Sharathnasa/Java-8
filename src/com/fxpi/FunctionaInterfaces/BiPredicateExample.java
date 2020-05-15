package com.fxpi.FunctionaInterfaces;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateExample {

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> listBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa()))
            listBiConsumer.accept(student.getName(), student.getActivities());
    });

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new BiPredicateExample().printNameAndActivities(studentList);
    }
}
