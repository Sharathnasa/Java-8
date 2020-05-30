package com.fxpi.streams;

import com.fxpi.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream()
                .filter((student -> student.getGradeLevel() >= 3))
                .map((student -> student.getNoteBooks()))
                //.reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }

}
