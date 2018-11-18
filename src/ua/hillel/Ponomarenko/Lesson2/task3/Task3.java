package ua.hillel.Ponomarenko.Lesson2.task3;
//Создайте массив размером n, элементами которого будут числа от n до 1

public class Task3 {
    public static void main(String[] args) {
        a(10);
    }

    public static void a(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=n-i;
            System.out.print(arr[i]+" ");
        }
    }
}
