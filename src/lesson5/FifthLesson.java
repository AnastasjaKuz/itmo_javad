package lesson5;

import java.util.Arrays;

public class FifthLesson {
    public static void main(String[] args) {
        // Массивы
        int[] ints1 = new int[7]; // где 7 - длина массива
                            // создан массив на 7 элемантов
                    // и заполнен значениями по умолчанию
        // размер массива изменить НЕЛЬЗЯ!!!

        // целочисленные массивы заполняются 0
        // массивы для float/double заполняются 0.0
        // массивы для boolean заполняются false
        // массивы всех ссылочных типов заполняются null

        System.out.println(ints1);
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = {5, 78, 1, 5, 90, -3};
        System.out.println(Arrays.toString(ints2));

        ints2 = new int[3];
        //ints2 = {1, 10, 100}; - так нельзя
        ints2 = new int[]{1, 10, 100}; // - Так можно
        System.out.println(Arrays.toString(ints2));

        // дилна масива - положительное значение типа int
        int len = 10;
        int[] ints3 = new int[len];
        String[] strings2 = new String[len * 2];

        System.out.println(ints3.length); // Узнать длинну массива

        // доступ к элемантам массива
        strings2 = new String[len * 2];
        strings2[4] = "red";
        strings2[0] = "yellow";
        strings2[10] = "black";
        System.out.println(Arrays.toString(strings2));

        System.out.println(strings2[12]); // null
        System.out.println(strings2[0]); // yellow

        // выход за пределы массива
        //System.out.println(strings2[39]); // java.lang.ArrayIndexOutOfBoundsException
                                //Index 39 out of bounds for length 20

        int[] ints4 = {4, 7, 0, -12, 67, 44};
        // Вывести в консоль случайный элемент массива
        int index = (int) (Math.random() * ints4.length);
        System.out.println(ints4[index]);

        //Перебор элементов массива
        // for позволяет изменять значения элементов массива
        // for позволяет перебирать массив в любой последовательности
        for (int arrindex = 0; arrindex <ints4.length ; arrindex++) {
            System.out.println(ints4[arrindex]);
            ints4[arrindex] += 100;
        }

        System.out.println(Arrays.toString(ints4));

        //foreach цикл - не имеет доступа к индексам
        // не позволяет изменять значения элементов массива
        //for(типДанных элемента имяПеременной: массив)
        int sum = 0;
        for (int elementValue : ints4) {
            //elementValue - значение элементов массива
            System.out.println(elementValue);
            sum += elementValue;
        }
        System.out.println(sum);

        //методы класса Arrays
        // сортировка
        int[] ints5 = {40, -6, 8, 90, 11};
        Arrays.sort(ints5);
        // алгоритм быстрой сортировки
        System.out.println(Arrays.toString(ints5));
        // метод sort меняет исходный массив в порядке возрастания

        // [-6, 8, 11, 40, 90]

        // метод поиска
        int elementIndex = Arrays.binarySearch(ints5, 40);
        System.out.println(elementIndex); // 3

        elementIndex = Arrays.binarySearch(ints5, 100);
        System.out.println(elementIndex); // -6
        // если метод вернул отрицательное число,
        // то такого элемента в массиве нет


        // копирование массивов
        // (для копирования не используется оператор =,
        // иначе он скопирует ссылки, а не значения

        double[] doubles1 = {3.5, 6.1, 0.7, 4.2, -8.9, -0.2};

        // 1. создание полной копии массива
        double[] cloneArr = doubles1.clone();
        System.out.println(Arrays.toString(cloneArr));

        // 2. создание частичной копии массива
        double[] copyArr = Arrays.copyOf(doubles1, 4);
        System.out.println(Arrays.toString(copyArr));

        // 3. создание частичной копии массива

        double[] newDoubles = new double[10];
        System.arraycopy(doubles1, 1, newDoubles, 3,2);
        // (откуда копируем, с какого момента копируем, куда,
        // с какого элемента вставляем, сколько элементов
        System.out.println(Arrays.toString(newDoubles));


    }
}
