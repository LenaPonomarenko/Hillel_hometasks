package ua.hillel.Ponomarenko.Lesson2.task2;

//Создайте массив размером n, элементами, которого будут числа от 1 до n

public class Task2 {
    public static void main(String[] args) {

        newArray(15);
    }

    public static void newArray(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
            System.out.print(arr[i] + " ");
        }
    }
}
