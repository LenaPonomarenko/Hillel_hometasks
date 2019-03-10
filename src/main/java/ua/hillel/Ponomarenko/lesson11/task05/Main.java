package ua.hillel.Ponomarenko.lesson11.task05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Дан список с числами и еще одно число. Определить  за один проход можно ли из двух чисел в списке составить  число.
к примеру List.of(8,3,4,5,1) и число 13 программа должна вывести индексы 0 и 3
если 20 - то программа должна сообщить то такой комбинации нет.
*/
public class Main {
    public static void main(String[] args) {
        int num = 9;
        List<Integer> list = List.of(6,5,7,3,9);
        int [] arr = findIndex(list,num);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] findIndex(List<Integer> list, int num){
        int array[] = new int[2];
    Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            if(hashMap.isEmpty() || !hashMap.containsKey(list.get(i))){
                hashMap.put(num-list.get(i),i);
            }else{
                array[0] = hashMap.get(list.get(i));
                array[1] = i;
                break;
            }
        }
        return array;
    }
}




