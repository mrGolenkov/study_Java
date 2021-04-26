package com.company.lesson11;
/*
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
3. В выполняющем методе main выведите максимальное число в консоль
*/
//решено

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class homeWork04 {
    public static void main(String[] args) throws IOException {
        int [] arr = initializeArray();
        int a = max(arr);
        System.out.println(a);
    }

    public static int max(int[] array){
       Arrays.sort(array);
       int a = array[2];
       return a;
    }


    public static int [] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            arr[i] = a;
        }
       return arr;
    }
}
