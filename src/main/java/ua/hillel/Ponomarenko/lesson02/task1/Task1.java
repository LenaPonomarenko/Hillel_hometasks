package ua.hillel.Ponomarenko.lesson02.task1;
//Выведите первые 5 элементов массива, у которого размер 10

import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        int arr[] = {54, 5, 7, 8, 96, 3, 0, 12, 4, 6};
        printFirstElements(arr);

    }

    public static void printFirstElements(int[] arr) {
        IntStream.of(arr).limit(5).forEach(System.out::println);
    }
}
