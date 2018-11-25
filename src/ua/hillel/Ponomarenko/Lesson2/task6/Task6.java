package ua.hillel.Ponomarenko.Lesson2.task6;

import java.util.stream.IntStream;

//Найдите сумму элементов массива
public class Task6 {
    public static void main(String[] args) {
        int arr[] = {4, 8, 6, 1, 3};
        int arr2[] = new int[0];
        sum(arr);
        sum(arr2);

    }

    public static void sum(int arr[]) {
        if (arr.length > 0) {
            System.out.println(IntStream.of(arr).reduce(0, (y, x) -> y + x));
        } else {
            System.out.println("Array is empty");
        }
    }
}
