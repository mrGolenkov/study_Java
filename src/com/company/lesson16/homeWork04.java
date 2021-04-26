package com.company.lesson16;
/*
Создать список чисел и заполнить его с консоли следующим образом:
чётные числа добавляют в конец списка, нечётные — в начало.
*/
//decided

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class homeWork04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
           String s = reader.readLine();
           if(s.isEmpty()){
               break;
           }
           int a = Integer.parseInt(s);
            if (a % 2 == 0){
                list.add(a);
           }
            else {
                list.add(0,a);
            }
            System.out.println(list);
        }


    }
}
