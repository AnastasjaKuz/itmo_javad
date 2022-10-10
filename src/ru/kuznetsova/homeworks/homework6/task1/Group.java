package ru.kuznetsova.homeworks.homework6.task1;

public class Group {
    private Mountain mountain;
    private Alpinist[] alpinists;
    private int maxAlpinists;
    private int numberOfAlpinists;

    public boolean isOpen(){
        return numberOfAlpinists < maxAlpinists;
    }

    public Group(Mountain mountain){
        this.mountain = mountain;
        int maxAlpinists1 = maxAlpinists;
        alpinists = new Alpinist[maxAlpinists];
    }

    public Mountain addMountain(){
        return mountain;
    }

    public Alpinist[] getAlpinists() {
        return alpinists;
    }

    public void printGroupInformation(){
        if (isOpen()){
            System.out.println("Набор в группу" + mountain.getName() + "открыт. Колличество мест:" + (maxAlpinists-numberOfAlpinists));
        }
        else {
            System.out.println("Набор в группу" + mountain.getName() + "закрыт");
        }
    }

    public void addAlpinists(Alpinist alpinist){
        if(isOpen()){
            alpinists[numberOfAlpinists] = alpinist;
            System.out.println("Альпинист добавлен в группу");
            numberOfAlpinists++;
        }
        else{
            System.out.println("Альпинист" + alpinist.getName() + "не добавлен в группу" + mountain.getName());
        }


    }
}
