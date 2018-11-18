package ua.hillel.Ponomarenko.Lesson1.task2;
//заполнить двумерный массив 10*10 случайными числами от 0 до 100

import java.lang.Math;

public class Task2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = (int) (Math.random() * 100);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

