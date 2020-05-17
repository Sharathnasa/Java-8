package com.fxpi.MethodReference;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.function.Predicate;

public class RefractorMethodReferenceExample {

    //how to convert the below Predicate to method reference?
    public static Predicate<Student> studentGradeLevelPredicate = (student) -> student.getGradeLevel() >= 3;

    // and this how to use method reference
    public static Predicate<Student> studentGradeLevelPredicateMethodReference = RefractorMethodReferenceExample::greaterThanGradeLevel;

    // we will create new method which actually checks the condition
    public static boolean greaterThanGradeLevel(Student s) {
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(studentGradeLevelPredicate.test(StudentDataBase.studentSupplier.get()));
        System.out.println(studentGradeLevelPredicateMethodReference.test(StudentDataBase.studentSupplier.get()));
    }
}
