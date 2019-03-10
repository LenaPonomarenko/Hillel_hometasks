package ua.hillel.Ponomarenko.lesson04.task02;

import java.util.stream.IntStream;

/*даны 10 баночек с таблетками и известно что все кроме одной содержат таблетки весом 10 миллиграмм одна содержит
таблетки весом 11 миллиграм.
Так же даны медицинские весы которые показываю точный вес.
Придумать и описать как с помощью одного взвешивания определить баночку в которой нестандарный вес таблеток.*/
public class Task02 {
    public static void main(String[] args) {
        //IntStream.rangeClosed(1, 10).forEach(System.out::println);
        int arr1[] = {11, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int arr2[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 11};
        int arr3[] = {10, 10, 10, 10, 10, 11, 10, 10, 10, 10};
        System.out.println(checkJarWithHeavierPills(arr1));
        System.out.println(checkJarWithHeavierPills(arr2));
        System.out.println(checkJarWithHeavierPills(arr3));
    }

    public static int checkJarWithHeavierPills(int weightOfPills[]) {
        int numOfJarWithHeavierPills = 0;
        for (int i = 0; i < weightOfPills.length; i++) {
            numOfJarWithHeavierPills += weightOfPills[i] * (i + 1);
        }
        numOfJarWithHeavierPills -= 550;
        return numOfJarWithHeavierPills;
    }
}

