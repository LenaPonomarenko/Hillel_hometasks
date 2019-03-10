package ua.hillel.Ponomarenko.lesson02.task2;

//Создайте массив размером n, элементами, которого будут числа от 1 до n

import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        newArray(15);
    }

    public static void newArray(int n) {
        IntStream.rangeClosed(1, n).forEach(System.out::println);
    }
}

