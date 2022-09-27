package lesson1;

public class FirstLesson {
    // точка входа в программу
    // psvm + enter
    public static void main(String[] args) {
        // sout + enter
        System.out.println("FirstLesson"); // вывод инфы в консоль
        // Обьявение переменных: типДанных имяПеременной
        int size; // обьявление переменной
        size = 56; // переменной size присвоили значение
        System.out.println(size);

        int count = 71899;
        int length = 134, width = 300;

        count = 800_000; // 800_000 = 800000, для удобства
        System.out.println(count);

        // если значение переменной типа long необходимо добавлять L для обозначения типа long
        long veryBig = 67_000_000_000L;

        double price = 89.34;

        // неоходимо добавлять символ F или f для обозначения типа float
        float temp = -78.3f;

        //System.out.println(price / 0); // +-Infinity - бесконечность
        //System.out.println(veryBig / 0); // ошибка, выполнение программы отанавливается

        // автоматическое приведение типов (возможно только при совместимых типах
        // и расширении контейнера)
        price = count;
        System.out.println(price);

        // явное приведение типов(возможно только при совместимых типах)
        byte small = (byte) count;
        System.out.println(small);

        // операнд1 / операнд2
        // - операнд

        // операторы
        int a = 9, b = 4;
        int c1 = a / b; // без остатка
        System.out.println(c1); // 2

        double c2 = (double) a / b;
        System.out.println(c2); // 2.25

        byte x = 6, y = 10;
        //byte z = x + y; // сложение byte или short всегда дает int
        byte z = (byte) (x + y); // сложили и потом перевели в byte
        System.out.println(z);

    }
}
