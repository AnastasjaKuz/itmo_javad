package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class FifthHomeWork {
    public static void main(String[] args) {
        // Задача 1

        int sum = 0;
        int len = 15;
        int [] mass = new int [len];
        for (int index = 0; index < mass.length; index++) {
            mass[index] += (int)(Math.random() * 100);
            sum += index;
        }
        Arrays.sort(mass);

        System.out.println(Arrays.toString(mass));
        System.out.println(mass[0]);
        System.out.println(mass[mass.length-1]);
        System.out.println(sum/ mass.length);

        // Задача 2

        int leng = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0){
                leng++;
            }
        }
        int[] mas = new int[leng];
        for (int i = 2, ind = 0; i <= 20; i++) {
            if (i % 2 == 0){
                mas[ind] = i;
                ind++;
            }
        }
        for (int a = mas.length - 1; a >= 0; a--){
            System.out.println(mas[a]);
        }
        // Задача 3

        //Задать массив на N слов.
        // В цикле считывать с консоли слова (scanner.nextLine()),
        // и добавлять их в массив (добавлять новое слово в массив можно только,
        // если в нем его еще нет). В итоге в массиве будут только уникальные слова.
        //Выход из программы по слову exit (слово 'exit' в массив не добавлять)
        // или если массив заполнен. Перед завершением программы,
        // вывести получившийся массив в консоль


        // Задача 4
        String s = "в предложении все слова разной длины";



        // Задача 5

        int[] arr = {10, 56, -82, 2, 6, -35, -98, 45, -23, -100, -6, 55, -45, -11};
        int positive = 0;
        int negative = 0;
        for (int element : arr){
            if (element > 0) positive++;
            else if (element < 0) negative++;
        }
        int[] positiveMass = new int[positive];
        int[] negativeMass = new int[negative];
        positive = 0;
        negative = 0;

        for (int element : arr){
            if (element > 0) positiveMass[positive++] = element;
            else if (element < 0) negativeMass[negative++] = element;
        }

        System.out.println(Arrays.toString(positiveMass));
        System.out.println(Arrays.toString(negativeMass));


    }
}
