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

        Complex comlexArr1[] = new Complex[]{new Complex(11, 6), new Complex(7, 1),
                new Complex(6), new Complex(17, 13), new Complex(9, 2),
                new Complex(16, 6)};
        Complex comlexArr2[] = new Complex[]{new Complex(8, 5), new Complex(1, 11),
                new Complex(17, 3), new Complex(3)};
        mergeSort(comlexArr1, 0, comlexArr1.length - 1);
        System.out.println("First sorted array: "+Arrays.toString(comlexArr1));
        mergeSort(comlexArr2, 0, comlexArr2.length - 1);
        System.out.println("Second sorted array: "+Arrays.toString(comlexArr2));

        Complex[] resultArray = joinArrays(comlexArr1, comlexArr2);
        merge(resultArray, 0, comlexArr1.length - 1, resultArray.length - 1);
        System.out.println("Merged sorted arrays: "+Arrays.toString(resultArray));

    }

    public static Complex[] joinArrays(Complex[] arr1, Complex[] arr2) {
        Complex[] array = new Complex[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            array[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            array[arr1.length + i] = arr2[i];
        }
        return array;
    }

    public static void mergeSort(Complex[] arr, int start, int end) {
        if (start < end) {
            if (end - start == 1) {
                if (arr[start].compareTo(arr[end]) == 1) {
                    arr[start] = arr[start].minus(arr[end]);
                    arr[end] = arr[start].plus(arr[end]);
                    arr[start] = arr[end].minus(arr[start]);
                }
            } else {
                mergeSort(arr, start, start + (end - start) / 2);
                mergeSort(arr, start + (end - start) / 2 + 1, end);
                merge(arr, start, start + (end - start) / 2, end);
            }
        }
    }

    public static void merge(Complex[] arr, int start, int middle, int end) {
        int first = start;
        int last = middle + 1;
        Complex array[] = new Complex[end - start + 1];
        int index = 0;

        while (first <= middle && last <= end) {
            if (arr[first].compareTo(arr[last]) == 1 || arr[first].compareTo(arr[last]) == 0) {
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
