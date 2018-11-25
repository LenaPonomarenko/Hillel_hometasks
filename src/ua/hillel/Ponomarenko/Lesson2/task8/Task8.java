package ua.hillel.Ponomarenko.Lesson2.task8;

import java.util.stream.IntStream;

//Определите сумму минимального и максимального элементов массива
public class Task8 {
    public static void main(String[] args) {
        int arr[] = {136, 3, 691, 5, 160};
        int arr1[] = new int[0];
        sumMaxMin(arr);
        sumMaxMin(arr1);


    }

    public static void sumMaxMin(int arr[]) {
        if (arr.length > 0) {
            System.out.println(IntStream.of(arr).min().getAsInt() + IntStream.of(arr).max().getAsInt());
        } else {
            System.out.println("Array is empty");
        }
    }
}

