package com.company.lesson16;
/*
Создать список из чисел и заполнить его на 5 элементов с консоли
Вывести все элементы списка в консоль
*/
//decided

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class homeWork01 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }
        System.out.println(list);
    }
}
