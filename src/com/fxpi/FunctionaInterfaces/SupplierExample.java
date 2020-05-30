package com.fxpi.FunctionaInterfaces;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"), 15);
        };

        Supplier<List<Student>> listSupplier = StudentDataBase::getAllStudents;

        System.out.println("Student is : " + studentSupplier.get());

        System.out.println("Students are : " + listSupplier.get());
    }
}
