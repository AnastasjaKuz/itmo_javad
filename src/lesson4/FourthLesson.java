package lesson4;

public class FourthLesson {
    public static void main(String[] args) {
        // char - примитивный тип данных, 16 бит - символ Unicode

        char char1 = 'J'; // 1 символ в одинарных ковычках // "J" - тип String
        char char2 = 74; // номер символа в диапазоне от 0 до 65535
        char char3 = '\u0044'; // 16ричное представление в escape последовательности

        System.out.print(char1); // J
        System.out.print(char2); // J
        System.out.print(char3); // D

        // Строка - упорядоченная последовательность символов, обязательно в ""
        // Строка - ссылочный , экземпляр класса String
        // Создание строк:
        // 1. в двойных кавычках "Строка"
        // 2.  через конструктор new String() - используется только, если
        // создание строки через "" невозможен

        // Строки неизменны, можно лишь стоздать новую на основе существующей
        // строка -> СТРОКА -> СтрокА

        // Хранение строк с 9 версииJava: массив byte в кодировке UTF-16 или LATIN-1


        String string1 = "Строка";
        String string2 = "Строка"; // попадают в пул

        String string3 = new String("Строка"); // попадают в heap память

        // ссылочные типы не сравнивают через ==,
        // т.к. оператор == сравнивает ссылки, а не фактические значения
        System.out.println(string1 == string2); // true
        System.out.println(string1 == string3); // false

        // интернирование строк
        String internString = string3.intern();
        System.out.println(internString == string1); // true
        string3 = string3.intern();

        // сравнение строк:
        System.out.println(string1.equals(string2));
        //  с учетом регистра: true - если равны, false - если нет
        System.out.println(string1.equalsIgnoreCase(string2));
        // без учета регистра

        string2 = null;
        //System.out.println(string2.equals("Строка")); // java.lang.NullPointerException
        System.out.println("Строка".equals(string2));

        // сравнение ссылочных типов с null
        System.out.println(string1 != null);
        System.out.println(string2 == null);

        if (string2 != null) System.out.println(string2.equals("Строка"));

        // конкатенация строк
        string1 = "Java";
        string2 = "Python";

        String concatString = string1 + " :: " + string2; // через +
        System.out.println(concatString);

        concatString = string1.concat(" :: ").concat(string2);
        System.out.println(concatString);
        // "Java ::"
        // "Java :: Python" -> concatString

        /*for (int i = 0; i <10; i += 1){
            concatString += i + " "; // так делать нельзя
        } */

        // StringBuilder - работает быстро,
        // но НЕ используется в многопоточных программах

        // stringBuffer - работает медленнее,
        // но используется в многопоточных программах (потокобозопасный)


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
               sb.append(i).append(" ");
        }

        concatString = sb.toString();

        System.out.println(concatString);

    }
}
