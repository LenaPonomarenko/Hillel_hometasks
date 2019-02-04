package ua.hillel.Ponomarenko.lesson06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Name1", "Surname1");
        Student student2 = new Student("Name2", "Surname2");

        Teacher teacher1 = new Teacher("Name1", "Surname1");

        Task task1 = new Task(1, "description");
        Task task2 = new Task(2, "description");
        Task task3 = new Task(3, "description");

        LessonTopic lessonTopic1 = new LessonTopic("topic1","description");
        LessonTopic lessonTopic2 = new LessonTopic("topic1","description");
        LessonTopic lessonTopic3 = new LessonTopic("topic1","description");

        Lesson lesson1 = new Lesson(1, "description", Arrays.asList(lessonTopic1,lessonTopic2));
        Lesson lesson2 = new Lesson(2, "description",Arrays.asList(lessonTopic3));

        HomeWork homeWork11 = new HomeWork(1, Arrays.asList(task1,task2), lesson1, 5);
        HomeWork homeWork12 = new HomeWork(2, Arrays.asList(task3), lesson2, 4);

        HomeWork homeWork21 = new HomeWork(1, Arrays.asList(task1,task2), lesson1, 4);
        HomeWork homeWork22 = new HomeWork(2, Arrays.asList(task3), lesson2, 4);

        student1.setHomeWork(Arrays.asList(homeWork11,homeWork12));
        student2.setHomeWork(Arrays.asList(homeWork21,homeWork22));

        teacher1.showStudentMarks(student1);
        teacher1.showStudentMarks(student2);

        student1.showMarks();

    }
}
