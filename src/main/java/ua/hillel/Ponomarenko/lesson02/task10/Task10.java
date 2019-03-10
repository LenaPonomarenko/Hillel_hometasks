package ua.hillel.Ponomarenko.lesson02.task10;
//Определите позицию (индекс) элемента с числом n, если такого числа нет, выведите соответствующее сообщение
public class Task10 {
    public static void main(String[] args) {
    int arr[]={4,6,45,6,12};
    findIndex(arr,65);
    findIndex(arr,6);
    }
    public static void findIndex(int arr[], int n){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n) {
                index = i;
                break;
            }
        }
        if (index!=-1)
            System.out.println("Index is:"+ index);
        else
            System.out.println("Index is not found");
    }
}
