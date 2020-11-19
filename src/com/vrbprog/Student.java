package com.vrbprog;

public class Student {
    private static int id = 1;

    private String firstName;
    private String lastName;
    private int studentId;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        studentId = id++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", studentId = " + studentId +
                '}';
    }

    public static int getCountStudent() {
        return id - 1;
    }
}
