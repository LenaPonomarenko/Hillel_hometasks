package ua.hillel.Ponomarenko.lesson04.task03;

import java.util.stream.IntStream;

/*
вывести простые числа. простое число это число которое делится только на себя и на 1.
начало 1 2 3 5 11 13
 */
public class Task03 {
    public static void main(String[] args) {
        IntStream.of(findPrimesByEratosthenesAlgorithm(3572)).forEach(x -> System.out.print(x + " "));
    }

    public static int[] findPrimesByEratosthenesAlgorithm(int n) {
        int primeNumbers[] = IntStream.rangeClosed(2, n).toArray();
        int p = 2;
        int index = 1;
        for (int i = index; i < primeNumbers.length; i++) {
            if (primeNumbers[i] == 0) {
                index++;
                continue;
            }
            for (int j = index; j < primeNumbers.length; j++) {
                if (primeNumbers[j] % p == 0) {
                    primeNumbers[j] = 0;
                }
            }
            for (int j = index; j < primeNumbers.length; j++) {
                if (primeNumbers[j] != 0) {
                    p = primeNumbers[j];
                    index = i + 1;
                    break;
                }
            }
        }
        primeNumbers = IntStream.of(primeNumbers).filter(x -> x != 0).toArray();
        return primeNumbers;
    }
}
