package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    // ATTRIBUTES

    private List<Student> students = new ArrayList<Student>();


    // GETTERS AND SETTERS
    public List<Student> getStudents() {
        return students;
    }

    // METHODS
    public void addStudent(Student student) {
        students.add(student);
    }

    public Student showStudentWithMatrikelNumber(int matrikelNumber) {
        for (Student student : students) {
            if (student.getMatrikelNumber() == matrikelNumber) {
                return student;
            }
        }
        return null;
    }

   /* public void deleteStudentWithMatrikelNumber(int matrikelNumber) {
        students.removeIf(student -> student.getMatrikelNumber() == matrikelNumber);
    }*/

    public void deleteStudentWithMatrikelNumber(int matrikelNumber) {
        Student studentToDelete = null;
        for (Student student : students) {
            if (student.getMatrikelNumber() == matrikelNumber) {
                studentToDelete = student;
            }
        }
        students.remove(studentToDelete);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
