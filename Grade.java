//7. WAP to group list of students by Grade
package com.naveen.asignments;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class Grade {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Amit", 92),
            new Student("Rohit", 85),
            new Student("Sneha", 76),
            new Student("Raj", 62),
            new Student("Priya", 54),
            new Student("Karan", 40),
            new Student("Simran", 89),
            new Student("Neha", 71),
            new Student("Varun", 95)
        );
        Map<String, List<Student>> groupedStudents = students.stream()
            .collect(Collectors.groupingBy(student -> getGrade(student.marks)));
        groupedStudents.forEach((grade, studentList) -> 
            System.out.println("Grade " + grade + ": " + studentList));
    }
    public static String getGrade(int marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F"; // Fail
    }
}
