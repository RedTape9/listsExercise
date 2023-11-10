package org.example;
public class Main {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent(new Student("John", "Doe", 12345));
        school.addStudent(new Student("Jessica", "Doe", 12346));
        school.addStudent(new Student("Max", "Mustermann", 12347));
        school.addStudent(new Student("Maria", "Mustermann", 12348));

        System.out.println(school.getStudents().toString());

        System.out.println(school.getStudentWithMatrikelNumber(12345));

        school.deleteStudentWithMatrikelNumber(12345);

        System.out.println("\n");

        System.out.println(school.getStudents().toString());

        Course mathe = new Course("Mathe", "Herr Müller", 101);
        Course deutsch = new Course("Deutsch", "Frau Schmidt", 102);
        Course englisch = new Course("Englisch", "Frau Meier", 103);

        school.getStudentWithMatrikelNumber(12346).addCourse(mathe);
        school.getStudentWithMatrikelNumber(12347).addCourse(deutsch);
        school.getStudentWithMatrikelNumber(12347).addCourse(englisch);

        System.out.println("\n");

        System.out.println(school.getStudentWithMatrikelNumber(12347).toString());
        System.out.println(school.getStudentWithMatrikelNumber(12347).getCourses().toString());


    }
}