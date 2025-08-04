package com.java8.modern.java8.streams_terminal;

import com.java8.modern.java8.data.Student;
import com.java8.modern.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAverageExample {

    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double average(){
        return  StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Sum of all notebooks : " + sum());
        System.out.println("Average No of notebooks : " + average());
    }
}
