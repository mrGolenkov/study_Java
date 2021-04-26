package com.company.lesson16;
/*
Создать список чисел и заполнить его с консоли
Разбить список на два других: - в первый список сохранять чётные числа - во второй список сохранять нечётные числа
Вывести содержимое всех списков в консоль. Каждый новый список выводить с новой строки, в ряд.
*/
//decided

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class homeWork06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            String s = reader.readLine();
            if(s.isEmpty()){
                break;
            }
            else{
                int B = Integer.parseInt(s);
                list.add(B);
            }
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            if(a % 2 == 0){
                even.add(a);
            }
            else{
                odd.add(a);
            }
        }
        System.out.println("EVEN NUMBER : " + even);
        System.out.println("ODD NUMBER : " + odd);
    }
}
