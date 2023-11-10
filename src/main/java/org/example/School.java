package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Student> students = new ArrayList<Student>();

    public List<Student> getStudents() {
        return students;
    }

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

    public void deleteStudentWithMatrikelNumber(int matrikelNumber) {
        students.removeIf(student -> student.getMatrikelNumber() == matrikelNumber);
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
