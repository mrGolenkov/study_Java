package com.company.lesson11;
/* Создать массив и заполнить его на 5 чисел используя быструю (статическую) инициализацию.
 Посчитать сумму элементов массива и вывести её на экран. */
//решено
public class homeWork02 {
    public static void main(String [] args) {

        int[] arr = new int[]{7, 4, 6, 9, 12};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            sum = sum + a;
        }

        System.out.println(sum);
    }
}
