package com.company.lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
1. Создай список строк.
2. Добавь в него 5 различных строчек с консоли.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
//decided
public class homeWork02 {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
        String s = reader.readLine();
        list.add(s);
        }

        System.out.println(list.size());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
