package ua.hillel.Ponomarenko.lesson06;

public class LessonTopic {
    String topic;
    String description;

    public LessonTopic() {
    }

    public LessonTopic(String topic) {
        this.topic = topic;
    }

    public LessonTopic(String topic, String description) {
        this.topic = topic;
        this.description = description;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
