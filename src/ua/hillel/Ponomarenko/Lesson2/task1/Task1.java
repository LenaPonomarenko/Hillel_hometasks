package ua.hillel.Ponomarenko.Lesson2.task1;
//Выведите первые 5 элементов массива, у которого размер 10

public class Task1 {
    public static void main(String[] args) {
        int arr[] = {54,5,7,8,96,3,0,12,4,6};
        printFirstElements(arr);
    }
    public static void printFirstElements(int [] a){
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
