package lesson2;

public class SecondLesson {
    public static void main(String[] args) {
        // Операторы сравнения
        int a = 78;
        int b = 9000;
        int c = 78;
        System.out.println(a > b); // false
        System.out.println(a >= c);// true

        // тернарный оператор ?
        int start = 3, end = 100;
        int res = start > end ? -1 : start;
        System.out.println(res);

        //  задачка
        int sum = 5000;
        int p = 100000;
        int sell = sum > p ? sum - sum / 10 : sum;
        System.out.println(sell);

        // if switch

        int state = 1;
        //  если state равен 0, вывести в консоль "закрытие приложения"
        // если state равен 1, вывести на консоль"Открытие приложения"
        // в остальных случаях вывести в кнсоль "Ошибка статуса"
        if (/* булевое выражение*/ state == 0) {
            System.out.println("Закрытие приложения");
        } else if (state == 1) {
            System.out.println("Открытие приложения");
        } else {
            System.out.println("Ошибка статуса");
        }

        // switch

        state = 100;
        //  если state равен 0, вывести в консоль "закрытие приложения"
        // если state равен 1 или 100, вывести на консоль"Открытие приложения"
        // в остальных случаях вывести в кнсоль "Ошибка статуса"

        switch (state) {
            case 0:
                System.out.println("закрытие приложения");
                break;
            case 1:
            case 100:
                System.out.println("Открытие приложения");
                break;
            default: // необязательный блок
                System.out.println("Ошибка статуса");
        }
    }
}
