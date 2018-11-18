package ua.hillel.Ponomarenko.Lesson2.task9;
//Определите произведение всех нечетных элементов массива
public class Task9 {
    public static void main(String[] args) {
        int arr[] ={2,4,5,16,7};
        multiplicationOfOdd(arr);
    }
    public static void multiplicationOfOdd(int arr[]){
        int multyply = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0)
                multyply*=arr[i];
        }
        System.out.println(multyply);
    }
}
