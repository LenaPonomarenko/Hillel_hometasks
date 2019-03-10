package ua.hillel.Ponomarenko.lesson03.task2;

/*Пользователь вводит целое десятичное число, требуется посчитать кольчиство едениц в двоичном предствлении этого числа.
пример 11 (десятичное) = 1011 (двоичное) программа должна вывести 3
подсказка Integer.toBinaryString
попробовать выполнить эту задачу без использования перевода в бинарную строку.*/
public class Task2 {
    public static void main(String[] args) {
        numberOfOnes(11);
    }

    public static void numberOfOnes(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        System.out.println(count);
    }
}
