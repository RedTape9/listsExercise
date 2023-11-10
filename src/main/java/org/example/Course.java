package org.example;

public class Course {

    private String courseName;
    private String teacher;
    private int roomNumber;

    // SETTERS AND GETTERS
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    // CONSTRUCTOR
    public Course(String courseName, String teacher, int roomNumber) {
        this.courseName = courseName;
        this.teacher = teacher;
        this.roomNumber = roomNumber;
    }

    // METHODS
    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", teacher='" + teacher + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}