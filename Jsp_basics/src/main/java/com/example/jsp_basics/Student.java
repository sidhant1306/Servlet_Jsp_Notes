package com.example.jsp_basics;

public class Student {
    int roll;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    // CONSTRUCTOR :
    public Student(int roll, String name) {
        super();
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}

