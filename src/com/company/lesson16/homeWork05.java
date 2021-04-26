package com.company.lesson16;
/*
Создать список чисел и заполнить его с консоли
Удалить все числа больше 5
*/
//decided
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class homeWork05 {

    public static void main(String[] args) throws IOException {
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
            for (int i = 0; i < list.size(); i++) {
                int a = list.get(i);
                if (a >= 5) {
                    list.remove(i);
                }
            }

        }
        System.out.println(list);

    }
}
