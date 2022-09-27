package lesson3;

import java.util.Scanner;

public class ThirdLesson {
    public static void main(String[] args) {
        //  Операторы:
        //  ИНКРЕМЕНТ ++ увеличивает значение переменной на 1
        //  ДЕКРЕМЕНТ -- уменьшает значение переменной на 1

        int a = 1;
        System.out.println(a++); // 1 // постфиксная форма
        // сначала возвращает значение в программу, а потом уыеличивает на 1
        System.out.println(a); // 2

        a = 1;
        System.out.println(++a); // 2 // префиксная форма сначала увеличивает, потом возвращает
        System.out.println(a); // 2

        a = 1;
        System.out.println(a--);// 1 // постфиксная форма
        System.out.println(a); // 0

        a = 1;
        System.out.println(--a); // 0 // префиксная форма
        System.out.println(a); // 0

        // ВВОД данных с клавиатуры
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int userNumber = in.nextInt();
        System.out.println(userNumber * userNumber);

        //  (while, do while, for)

        int printsCount = 3;
        while (printsCount > 0) { // тело цикла
            System.out.println("=====");
            printsCount--;
        } // повторение инструкции из тела цикла называется итерацией

        /* while (False){
            System.out.println("False");
        } */ // Не будет выполнено ни одной итерации

       /* while (true){
            System.out.println("Введите целое положительное число или 0 для выхода из программы");
            userNumber = in.nextInt();
            // Директивы break и continue
            if (userNumber == 0) break; // завершение текущего цикла
            if (userNumber < 0) continue; // переход на след итерацию,
                                          // с проверкой условия
            System.out.println(userNumber * userNumber);
        } */

        // вывеси все четные числа от start до end
        int start = 1, end = 13;
        while (start <= end) {
            if (start % 2 == 0) System.out.println(start);
            start++;
        }
        // for (;;){} - бесконечный цикл

        for (int s = 1, e = 13; // иницоализация счетчиков
             s <= e; // булевое выражение ил условие
             s++) { // обновление счетчиков
            if (s % 2 == 0) System.out.println(s);
        }

    }
}

