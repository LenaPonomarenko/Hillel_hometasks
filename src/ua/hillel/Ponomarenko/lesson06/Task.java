package ua.hillel.Ponomarenko.lesson06;

public class Task {
    private int num;
    private String description;

    public Task() {
    }

    public Task(int num, String description) {
        this.num = num;
        this.description = description;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "num=" + num +
                ", description='" + description + '\'' +
                '}';
    }
}
