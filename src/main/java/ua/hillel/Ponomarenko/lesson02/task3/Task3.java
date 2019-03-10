package ua.hillel.Ponomarenko.lesson02.task3;
//Создайте массив размером n, элементами которого будут числа от n до 1

import java.util.stream.IntStream;

public class Task3 {
    public static void main(String[] args) {
        createArray(11);
    }

    public static void createArray(int n) {
        IntStream.iterate(n, x -> x > 0, x -> x - 1).forEach(System.out::println);
    }
}
