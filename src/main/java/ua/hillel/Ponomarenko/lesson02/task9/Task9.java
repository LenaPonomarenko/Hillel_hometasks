package ua.hillel.Ponomarenko.lesson02.task9;

import java.util.stream.IntStream;

//Определите произведение всех нечетных элементов массива
public class Task9 {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 16, 7};
        int arr2[] = new int[0];
        multiplicationOfOdd(arr);
        multiplicationOfOdd(arr2);

    }

    public static void multiplicationOfOdd(int arr[]) {
        if (arr.length > 0) {
            System.out.println(IntStream.of(arr).filter(x -> x % 2 != 0).reduce(1, (y, x) -> y * x));
        } else {
            System.out.println("Array is empty");
        }
    }
}
