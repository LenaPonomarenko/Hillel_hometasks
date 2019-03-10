package ua.hillel.Ponomarenko.lesson06;

import java.util.List;

public class Course {
    private String courseName;
    private String description;
    private int amountOfLessons;
    private Teacher teacher;
    private List<Student> students;
    private List<Lesson> lessons;

    public Course() {
    }

    public Course(String courseName, String description, int amountOfLessons, Teacher teacher,
                  List<Student> students, List<Lesson> lessons) {
        this.courseName = courseName;
        this.description = description;
        this.amountOfLessons = amountOfLessons;
        this.teacher = teacher;
        this.students = students;
        this.lessons = lessons;
    }

    public Course(String courseName, int amountOfLessons, Teacher teacher) {
        this.courseName = courseName;
        this.amountOfLessons = amountOfLessons;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmountOfLessons() {
        return amountOfLessons;
    }

    public void setAmountOfLessons(int amountOfLessons) {
        this.amountOfLessons = amountOfLessons;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
