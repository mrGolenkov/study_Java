package com.company.lesson16;
/*
Создать список из целых чисел и заполнить его с консоли
Ввод целых чисел с клавиатуры продолжается, пока не ввели пустую строку в консоли
После того, как ввод завершён - вывести все элементы списка в консоль
*/
//decided

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class homeWork03 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            } else {
                int a = Integer.parseInt(s);
                list.add(a);
            }
        }
        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
