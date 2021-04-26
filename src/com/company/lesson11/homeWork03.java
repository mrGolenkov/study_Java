package com.company.lesson11;
/* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
Найти минимальный элемент в массиве и вывести его в консоль. */
//решено

import java.util.Arrays;

public class homeWork03 {
    public static void main(String[] args) {
        int[] arr = new int[]{7,4,6,12,2,8};
        //первый способ решено с помощью цикла(в ручную)
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.print(min);

//второй способ, решено с помощью сортировки и вывода в консоль самого первого значения
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
