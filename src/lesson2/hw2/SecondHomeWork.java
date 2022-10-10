package hw2;

public class SecondHomeWork {
    public static void main(String[] args) {
        // Задача на if
        int mounth = 5;
        if (mounth >= 1 && mounth <= 2){
            System.out.println("Зима");
        } else if (mounth >= 3 && mounth <= 5){
            System.out.println("Весна");
        } else if (mounth >= 6 && mounth <= 8){
            System.out.println("Лето");
        } else if (mounth >= 9 && mounth <= 11){
            System.out.println("Осень");
        } else if (mounth == 12){
            System.out.println("Зима");
        } else{
            System.out.println("Ошибка ввода");
        }
        // Задача на switch
        //1
        double sum = 100_000;
        int saleCode = 4525;
        switch (saleCode) {
            case 4525:
                sum = sum * 0.3;
                //System.out.println("К оплате" + sum);
                break;
            case 6424:
            case 7012:
                sum = sum * 0.2;
                //System.out.println("К оплате" + sum);
                break;
            case 7647:
            case 9011:
            case 6612:
                sum = sum * 0.1;
                //System.out.println("К оплате" + sum);
                break;
            default:
                //System.out.println("К оплате" + sum);
        }
        System.out.println("К оплате" + sum);


        // Задача на if
        int count = 84;
        if (count >=0 && count <= 39){
            System.out.println("Попробуйте в следующий раз");
        } else if (count >=40 && count <= 59){
            System.out.println("Удовлетворительно");
        } else if (count >=60 && count <= 89){
            System.out.println("Хорошо");
        } else if (count >=90 && count <= 100){
            System.out.println("Отлично");
        }


        // Задача на Math.random() и if
        int chislo = 110;
        if (chislo > 25 && chislo < 200){
            System.out.println("Число содержится в интервале");
        } else{
            System.out.println("Число не содержится в интервале");
        }

        int a = 10;
        int b = 500;

        int random_number = (int)(a + (Math.random() * b));
        System.out.println(random_number);

        if (random_number > 25 && random_number < 200){
            System.out.println("Число содержится в интервале");
        } else{
            System.out.println("Число не содержится в интервале");
        }

        // Задача на if
        int age = 85;
        int exp = 3;
        if (age > 100){
            System.out.println("Мы Вам перезвоним");
        } else if (exp < 5){
            System.out.println( "Вы подходите на должность стажера");
        } else if ( exp >= 5){
            System.out.println( "Вы подходите на должность разработчика");
        }
    }

}
