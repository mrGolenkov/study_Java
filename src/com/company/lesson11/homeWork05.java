package com.company.lesson11;
/* Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
//решено
public class homeWork05 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }
        }
    }
}
