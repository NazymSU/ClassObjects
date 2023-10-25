package com.company;

public class Student {
    String name;
    String surname;
    double gpa;

    public Student() {
    }

    public Student(String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGpa() {
        return gpa;
    }
}
