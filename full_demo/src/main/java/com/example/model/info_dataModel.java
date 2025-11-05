package com.example.model;

public class info_dataModel {
    String print_username;
    String print_password;
    String print_school;
    String print_grades;
    int print_height;
    int print_weight;

    public String getPrint_username() {
        return print_username;
    }

    @Override
    public String toString() {
        return "children_dataModel{username='" + print_username + '\'' +
                ", school='" + print_school + '\'' +
                ", grades='" + print_grades + '\'' +
                ", height=" + print_height +
                ", weight=" + print_weight +
                '}';
    }

    public void setPrint_username(String print_username) {
        this.print_username = print_username;
    }

    public int getPrint_weight() {
        return print_weight;
    }

    public void setPrint_weight(int print_weight) {
        this.print_weight = print_weight;
    }

    public int getPrint_height() {
        return print_height;
    }

    public void setPrint_height(int print_height) {
        this.print_height = print_height;
    }

    public String getPrint_grades() {
        return print_grades;
    }

    public void setPrint_grades(String print_grades) {
        this.print_grades = print_grades;
    }

    public String getPrint_school() {
        return print_school;
    }

    public void setPrint_school(String print_school) {
        this.print_school = print_school;
    }


}
