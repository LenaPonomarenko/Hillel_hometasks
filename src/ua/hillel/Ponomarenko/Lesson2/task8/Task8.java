package ua.hillel.Ponomarenko.Lesson2.task8;

//Определите сумму минимального и максимального элементов массива
public class Task8 {
    public static void main(String[] args) {
        int arr[] = {136, 3, 691, 5, 160};
        sumMaxMin(arr);
    }

    public static void sumMaxMin(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
           if(arr[i]>max)
               max=arr[i];
           if(arr[i]<min)
               min=arr[i];
        }
        System.out.println(max+min);
    }
}
