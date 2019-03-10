package ua.hillel.Ponomarenko.lesson06;

import java.util.List;

public class Lesson {
    private int number;
    private String description;
    private List<LessonTopic> lessonTopics;

    public Lesson() {
    }

    public Lesson(int number, String description) {
        this.number = number;
        this.description = description;
    }

    public Lesson(int number, String description, List<LessonTopic> lessonTopics) {
        this.number = number;
        this.description = description;
        this.lessonTopics = lessonTopics;
    }

    public Lesson(int lessonNumber) {
        this.number = lessonNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LessonTopic> getLessonTopics() {
        return lessonTopics;
    }

    public void setLessonTopics(List<LessonTopic> lessonTopics) {
        this.lessonTopics = lessonTopics;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "number=" + number +
                ", description='" + description + '\'' +
                '}';
    }
}
