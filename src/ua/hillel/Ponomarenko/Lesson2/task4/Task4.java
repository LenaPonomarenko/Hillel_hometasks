package ua.hillel.Ponomarenko.Lesson2.task4;
//Выведите элементы массива, которые делятся на 3 без остатка
public class Task4 {
    public static void main(String[] args) {
        int arr[]={45,56,22,15,13,9,65,27};
        elementsWithoutRemainder(arr);
    }
    public static void elementsWithoutRemainder(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
