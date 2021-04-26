package com.company.lesson11;
/* Ввести 5 чисел с клавиатуры и записать их в массив. Вывести содержимое массива в консоль */
//решено
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class homeWork01 {

    public static void main(String[] args)throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(reader.readLine());
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
