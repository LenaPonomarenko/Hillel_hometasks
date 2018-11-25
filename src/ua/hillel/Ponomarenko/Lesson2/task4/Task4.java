package ua.hillel.Ponomarenko.Lesson2.task4;

import java.util.stream.IntStream;

//Выведите элементы массива, которые делятся на 3 без остатка
public class Task4 {
    public static void main(String[] args) {
        int arr[] = {45, 56, 22, 15, 13, 9, 65, 27};
        int arr2[] = new int[0];
        elementsWithoutRemainder(arr);
        elementsWithoutRemainder(arr2);

    }

    public static void elementsWithoutRemainder(int arr[]) {
        if (arr.length > 0) {
            IntStream.of(arr).filter(x -> x % 3 == 0).forEach(System.out::println);
        } else {
            System.out.println("Array is empty");
        }
    }
}
