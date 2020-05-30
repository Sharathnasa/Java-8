package com.fxpi.streams;

import com.fxpi.data.Student;
import com.fxpi.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        //student name and activities in a map

        Map<String, List<String>> stringListMap = StudentDataBase.getAllStudents().stream()
                // this print intermediate result, which will be helpful to debug
//                .peek((student -> {
//                    System.out.println("Before filter");
//                }))
                .filter((student -> student.getGpa() >= 3))
                .peek((student -> {
                    System.out.println("After 1st filter : "+ student);
                }))
                .filter((student -> student.getGpa() >= 3.9))
                .peek((student -> {
                    System.out.println("After 2nd filter : "+ student);
                }))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(stringListMap);
    }
}
