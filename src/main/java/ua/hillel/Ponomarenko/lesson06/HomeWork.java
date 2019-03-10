package ua.hillel.Ponomarenko.lesson06;

import java.util.List;

public class HomeWork {
    private int num;
    private List<Task> tasks;
    private Lesson lesson;
    private int mark;

    public HomeWork() {
    }

    public HomeWork(int num, Lesson lesson) {
        this.num = num;
        this.lesson = lesson;
    }

    public HomeWork(int num, List<Task> tasks, Lesson lesson, int mark) {
        this.num = num;
        this.tasks = tasks;
        this.lesson = lesson;
        this.mark = mark;
    }

    public HomeWork(int num, List<Task> tasks, Lesson lesson) {
        this.num = num;
        this.tasks = tasks;
        this.lesson = lesson;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "num=" + num +
                ", lesson=" + lesson +
                ", mark=" + mark +
                '}';
    }
}
