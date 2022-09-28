package hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Задача на WHILE

        Scanner tarelka = new Scanner(System.in);
        Scanner sredstvo = new Scanner(System.in);


        System.out.println("Введите количество тарелок");
        System.out.println("Введите количество моющего стредства");

        int tarelka1 = tarelka.nextInt();
        double sredstvo1 = sredstvo.nextDouble();

        while (tarelka1 > 0 && sredstvo1 > 0) {
            tarelka1--;
            sredstvo1 -= 0.5;
            System.out.println(tarelka1);
            System.out.println(sredstvo1);
        }
        System.out.println(tarelka1);
        System.out.println(sredstvo1);


        int unknownumber, usernumber, truecount = 0;
        System.out.println("Угадай число");
        unknownumber = (int) Math.floor(Math.random() * 9);
        do {
            truecount++;
            Scanner input = new Scanner(System.in);
            usernumber = input.nextInt();
            if (unknownumber > usernumber) {
                System.out.println("загаданное число больше");
            } else if (unknownumber < usernumber) {
                System.out.println("загаданное число меньше");
            } else if (usernumber == unknownumber) {
                System.out.println("Вы угадали");
            }
        } while (unknownumber != usernumber);
        System.out.println("количество попыток" + truecount);



    }
}




