package ua.hillel.Ponomarenko.lesson05.task01;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        Complex complexNum1 = new Complex(3.0, 9.0);
        Complex complexNum2 = new Complex(8.0, 7.0);
        Complex compl3 = new Complex();
        System.out.println(compl3);
        System.out.println(complexNum1.plus(complexNum2));
        System.out.println(complexNum1.minus(complexNum2));
        System.out.println(complexNum1.multiply(complexNum2));
        System.out.println(complexNum1.divide(complexNum2));
        System.out.println(complexNum1.compareTo(complexNum2));

        Complex comlexArr1[] = new Complex[]{new Complex(11, 13), new Complex(7, 5),
                new Complex(9, 3), new Complex(16, 2)};
        Complex comlexArr2[] = new Complex[]{new Complex(8, 4), new Complex(17, 5),
                new Complex(3, 9)};
        Complex complexArr3[] = new Complex[comlexArr1.length + comlexArr2.length];
        mergeSort(comlexArr1, 0, comlexArr1.length - 1);
        System.out.println(Arrays.toString(comlexArr1));
        mergeSort(comlexArr2, 0, comlexArr2.length - 1);
        System.out.println(Arrays.toString(comlexArr2));
        for (int i = 0; i < comlexArr1.length; i++) {
            complexArr3[i] = comlexArr1[i];
        }
        for (int i = 0; i < comlexArr2.length; i++) {
            complexArr3[comlexArr2.length + i] = comlexArr2[i];
        }
        merge(complexArr3, 0, complexArr3.length - 1);
        System.out.println(Arrays.toString(complexArr3));
    }

    public static void mergeSort(Complex[] arr, int start, int end) {
        if (start < end) {
            if (end - start == 1) {
                if (arr[start].compareTo(arr[end]) == -1) {
                    arr[start] = arr[start].minus(arr[end]);
                    arr[end] = arr[start].plus(arr[end]);
                    arr[start] = arr[end].minus(arr[start]);
                }
            } else {
                mergeSort(arr, start, start + (start + end) / 2);
                mergeSort(arr, start + (start + end) / 2 + 1, end);
                merge(arr, start, end);
            }
        }
    }

    public static void merge(Complex[] arr, int start, int end) {
        int middle = start + (end - start) / 2;
        int first = start;
        int last = middle + 1;
        Complex array[] = new Complex[end - start + 1];
        int index = 0;

        while (first <= middle && last <= end) {
            if (arr[first].compareTo(arr[last]) == -1 || arr[first].compareTo(arr[last]) == 0) {
                array[index] = arr[last];
                last++;
            } else {
                array[index] = arr[first];
                first++;
            }
            index++;
        }
        while (first <= middle) {
            array[index] = arr[first];
            first++;
            index++;
        }
        while (last <= end) {
            array[index] = arr[last];
            last++;
            index++;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            arr[i] = array[count];
            count++;
        }
    }
}
