package ua.hillel.Ponomarenko.lesson04.task01;

import java.util.stream.IntStream;

/*Пользователь вводит отсортированный массив чисел и еще одно число. Требуется сформировать новый отсортированый массив
котрый соостоит из исходного и нового числа.*/
public class Task01 {
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 12, 46};

        IntStream.of(newSortedArray(arr, 105)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        IntStream.of(newSortedArray(arr, -5)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        IntStream.of(newSortedArray(arr, 1)).forEach(x -> System.out.print(x + " "));
    }

    public static int[] newSortedArray(int[] sortedArr, int number) {
        int newArray[] = new int[sortedArr.length + 1];
        if (number >= sortedArr[sortedArr.length - 1]) {
            for (int j = 0; j < sortedArr.length; j++) {
                newArray[j] = sortedArr[j];
            }
            newArray[newArray.length - 1] = number;
        } else if (number < sortedArr[0]) {
            newArray[0] = number;
            for (int i = 0; i < sortedArr.length; i++) {
                newArray[i + 1] = sortedArr[i];
            }
        } else {
            for (int i = 0; i < sortedArr.length - 1; i++) {
                if ((number >= sortedArr[i] && number < sortedArr[i + 1])) {
                    for (int j = 0; j <= i; j++) {
                        newArray[j] = sortedArr[j];
                    }
                    newArray[i + 1] = number;
                    for (int j = i + 1; j < sortedArr.length; j++) {
                        newArray[j + 1] = sortedArr[j];
                    }
                    break;
                }
            }
        }
        return newArray;
    }
}
