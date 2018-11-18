package ua.hillel.Ponomarenko.Lesson2.task6;
//Найдите сумму элементов массива
public class Task6 {
    public static void main(String[] args) {
        int arr[]={4,8,6,1,3};
        sum(arr);
    }
    public static void sum(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
        }
        System.out.println(count);
    }
}
