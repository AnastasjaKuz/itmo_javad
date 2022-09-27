package hw1;

public class Task2 {
    public static void main(String[] args) {
        int a = 45;
        int b = a % 10;
        int a1 = a - b;
        int a2 = a1 / 10;
        int c = a2 % 10;
        int suma = b + c;
        //System.out.println(b);
        //System.out.println(c);
        System.out.println(suma);


        int e = 11;
        int f = e % 10;
        int e1 = (e - f)/10;
        int g = e1 % 10;
        int suma2 = f + g;
        System.out.println(suma2);

    }
}
