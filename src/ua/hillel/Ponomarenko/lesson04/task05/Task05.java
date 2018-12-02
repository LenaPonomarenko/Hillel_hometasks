package ua.hillel.Ponomarenko.lesson04.task05;

import java.util.stream.IntStream;

//Вывести последовательно числа фибоначи
public class Task05 {
    public static void main(String[] args) {
        IntStream.of(fibonaciiNumbers(40)).forEach(x -> System.out.print(x + " "));
    }

    public static int[] fibonaciiNumbers(int n) {
        int fibonaciiArray[] = new int[n];
        fibonaciiArray[0] = 0;
        fibonaciiArray[1] = 1;
        for (int i = 0; i < fibonaciiArray.length - 2; i++) {
            fibonaciiArray[i + 2] = fibonaciiArray[i] + fibonaciiArray[i + 1];
        }
        return fibonaciiArray;
    }
}
