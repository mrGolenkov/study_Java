package com.company.lesson12;
/*
1. Создать массив на 5 строк.
2. Создать массив на 5 чисел.
3. Ввести с клавиатуры 5 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/
// decided

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class homeWork03 {
    public static void main(String[] args) throws IOException {
        int [] IntegerArray = new int[5];
        String [] StringArray = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < StringArray.length; i++) {
            String s = reader.readLine();
            StringArray[i] = s;
        }
        for (int i = 0; i < StringArray.length; i++) {
            IntegerArray[i] = StringArray[i].length();
        }

        for (int i = 0; i < IntegerArray.length; i++) {
            System.out.println(IntegerArray[i]);
        }
    }
}
