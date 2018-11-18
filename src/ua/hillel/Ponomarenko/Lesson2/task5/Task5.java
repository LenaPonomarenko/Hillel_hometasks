package ua.hillel.Ponomarenko.Lesson2.task5;
//Выведите все четные элементы массива
public class Task5 {
    public static void main(String[] args) {
        int arr[] = {45,6,98,3,22,11,37,66};
        printEven(arr);
    }

    public static void printEven(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
