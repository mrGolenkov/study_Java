package com.company.lesson12;
/*
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
//decided

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class homeWork04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            arr1[i] = a;
        }

        int[] arr2 = new int[5];
        int[] arr3 = new int[5];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];

        }for (int i = 0; i < arr3.length; i++) {
            arr3[i] = arr1[i+5];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }


    }

}
