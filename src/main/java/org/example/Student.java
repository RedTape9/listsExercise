package org.example;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private int matrikelNumber;
    private ArrayList<Course> courses = new ArrayList<>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMatrikelNumber() {
        return matrikelNumber;
    }

    public void setMatrikelNumber(int matrikelNumber) {
        this.matrikelNumber = matrikelNumber;
    }

    public Student(String name, String surname, int number) {
        this.name = name;
        this.surname = surname;
        this.matrikelNumber = number;
    }

    // Füge eine Methode hinzu, mit der man course zum student hinzufügt
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", matrikelNumber=" + matrikelNumber +
                '}';
    }

    public Object getCourses() {
        return courses;
    }
}
