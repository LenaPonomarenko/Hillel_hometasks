package ua.hillel.Ponomarenko.Lesson2.task7;

import java.util.stream.IntStream;

//Найдите среднее арифметическое элементов массива
public class Task7 {
    public static void main(String[] args) {
        int arr[]={4,8,6,1,3};
        int arr1[] = new int[0];
        average(arr);
        average(arr1);
    }
    public static void average(int arr[]){
        if (arr.length>0) {
            System.out.println((double) IntStream.of(arr).reduce(0, (y, x) -> y + x)/arr.length);
        }
        else {
            System.out.println("Array is empty");
        }
    }
}

