package ru.kuznetsova.homeworks.homework6.task1;
import ru.kuznetsova.homeworks.homework6.task1.Group;
import ru.kuznetsova.homeworks.homework6.task1.Mountain;
import ru.kuznetsova.homeworks.homework6.task1.Alpinist;

public class Main {
    public static void main(String[] args) {
       Mountain babadag = new Mountain("Бабадаг", "Турция", 1969);
       Mountain everest = new Mountain("Эверест", "Россия", 8849);
       Mountain monblan = new Mountain("Монблан", "Италия", 4810);

       Alpinist igor = new Alpinist("Игорь", "Россия");
       Alpinist ivan = new Alpinist("Иван", "Россия");
       Alpinist tom = new Alpinist("Tom", "USA");
       Alpinist demon = new Alpinist("Demon", "USA");
       Alpinist antonio = new Alpinist("Antonio", "Italy");
       Alpinist izabel = new Alpinist("Izabel", "France");
       Alpinist agata = new Alpinist("Agata", "Great Britain");

       Group babadagGroup = new Group(babadag);
       Group everestGroup = new Group(everest);
       Group monblanGroup = new Group(monblan);

       babadagGroup.addAlpinists(igor);
       babadagGroup.addAlpinists(tom);
       babadagGroup.addAlpinists(izabel);
       babadagGroup.printGroupInformation();


    }
}
