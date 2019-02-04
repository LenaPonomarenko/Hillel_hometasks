package ua.hillel.Ponomarenko.lesson06;

public class Teacher extends Person {
    public Teacher(String name, String surname) {
        super(name, surname);
    }

    public void showStudentMarks(Student student){
        System.out.println(student+" marks.");
        for (HomeWork homeWork:student.getHomeWork()) {
            System.out.println("Home work "+ homeWork.getNum()+", mark: "+homeWork.getMark());
        }
    }

    @Override
    public String toString() {
        return "Teacher: "+ getName()+ " "+getSurname();
    }
}
