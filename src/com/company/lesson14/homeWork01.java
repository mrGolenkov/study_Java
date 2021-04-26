package com.company.lesson14;
/* Задача по алгоритмам.
Есть массив чисел, в котором все числа дублируются, кроме одного.
Найдите число, которое не имеет дубликатов в массиве.
Пример ввода: {1, 2, 3, 3, 4, 5, 7, 5, 6, 2, 4, 7, 6}
Пример вывода: 1
*/
//decided

import java.util.Arrays;

public class homeWork01 {
    public static void main(String[] args) {
        int []arr = new int[]{1, 2, 3, 3, 6, 5, 7, 5, 6, 2, 4, 7, 1};
        Arrays.sort(arr);

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if(a == arr[i+1]){
                i++;
            }
            else{
                temp = a;
            }
        }
        System.out.println(temp);
    }
}
