package ua.hillel.Ponomarenko.Lesson2.task5;

import java.util.stream.IntStream;

//Выведите все четные элементы массива
public class Task5 {
    public static void main(String[] args) {
        int arr[] = {45, 6, 98, 3, 22, 11, 37, 66};
        int arr2[] = new int[0];
        printEven(arr);
        printEven(arr2);
    }

    public static void printEven(int arr[]) {

        if (arr.length > 0) {
            IntStream.of(arr).filter(x -> x % 2 == 0).forEach(System.out::println);
        } else {
            System.out.println("Array is empty");
        }
    }
}
