package ua.hillel.Ponomarenko.lesson06;

import java.util.List;

public class Student extends Person {
    private List<HomeWork> homeWork;
    public Student(String name, String surname) {
        super(name, surname);
    }

    public List<HomeWork> getHomeWork() {
        return homeWork;
    }

    public void setHomeWork(List<HomeWork> homeWork) {
        this.homeWork = homeWork;
    }

    public void showMarks(){
        System.out.println("Student marks");
        for (HomeWork work : homeWork) {
            System.out.println("Home work "+ work.getNum()+", mark: "+work.getMark());
        }
    }

    @Override
    public String toString() {
        return "Student: " + getName() + " " + getSurname();
    }
}
