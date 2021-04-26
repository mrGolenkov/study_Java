package com.company.lesson14;
/*
Создать массив на 5 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/
//decided

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class homeWork02 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            array[i] = a;
        }
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
