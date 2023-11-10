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

    public Student getStudentWithMatrikelNumber(int matrikelNumber) {
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
            if (getStudentWithMatrikelNumber(matrikelNumber) != null) {
                students.remove(getStudentWithMatrikelNumber(matrikelNumber));
            }
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
