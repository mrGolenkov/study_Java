package com.company.lesson12;
/*
В методе initializeArray():
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
В методе printArray():
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
Каждый элемент - с новой строки.
*/
//решено
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class homeWork02 {

    public static int[] initializeArray()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int []arr = new int[10];
        for (int i = 0; i <= 7; i++) {
            int a = Integer.parseInt(reader.readLine());
                arr[i] = a;
        }
        return arr;
    }
    public static int[] printArray(int[]array){
        int [] arr = new int[10];
        for (int i = 0; i < array.length; i++) {
           arr[i] = array[9 - i];
        }
        return arr;
    }

    public static void main(String[] args)throws IOException {
        int []array2 = printArray(initializeArray());
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
