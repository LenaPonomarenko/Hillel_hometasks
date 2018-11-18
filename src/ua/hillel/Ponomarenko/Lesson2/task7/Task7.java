package ua.hillel.Ponomarenko.Lesson2.task7;
//Найдите среднее арифметическое элементов массива
public class Task7 {
    public static void main(String[] args) {
        int arr[]={4,8,6,1,3};
        average(arr);
    }
    public static void average(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
        }
        System.out.println((double)count/arr.length);
    }
}

