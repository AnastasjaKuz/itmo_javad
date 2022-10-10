package ru.kuznetsova.homeworks.homework6.Task3;

public class Cat {
    private String name;
    private int speed;
    private int weight;
    private Mouse[] mice;

    public int mouseCounter;

    public Cat(String name, int speed, int weight){
        setName(name);
        setSpeed(speed);
        setWeight(weight);
        addMouse();
    }

    public void setName(String name){
        if(name.length() < 3){
            throw new IllegalArgumentException("Имя кота не может содержать меньше 3 букв");
        }
        this.name = name;
    }

    public void setSpeed(int speed){
        if (speed < 1){
            throw new IllegalArgumentException("Скорость кота не может быть меньше 1км/ч");
        }
        this.speed = speed;
    }


    public void setWeight(int weight){
        if (weight < 3){
            throw new IllegalArgumentException("Кот не может весить меньше 3 кг");
        }
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public Mouse[] getMice() {
        return mice;
    }

    private void addMouse(){
        if (mouseCounter == 0){
            mice = new Mouse[100];
        }
    }

    public void catchMouse(Mouse mouse){
        if (speed > mouse.getSpeed()){
            if (mouseCounter < mice.length){
                System.out.println("Кот" + getName() + "сьел мышь");
                mice[mouseCounter] = mouse;
                mouseCounter++;
            } else System.out.println("В меня больше не влезет");
        }
    }

    public Mouse[] lostMice(){
        Mouse[] lostMiceArray = mice.clone();
        mouseCounter = 0;
        addMouse();
        return lostMiceArray;
    }

   public void attackAnotherCat(Cat cat){
        if (weight < cat.getWeight()){
            System.out.println("Кот" + getName() + "отобрал мышей у кота"+ cat.getName());
            Mouse[] anotherCatMice = cat.lostMice();
            for (Mouse mouse: anotherCatMice){
                if(mice != null) catchMouse(mouse);
            }
        } else if (cat.getWeight() < weight){
            cat.attackAnotherCat(this);
        }
   }

   public void printMice(){
        mouseCounter = 0;
       System.out.println("мыши кота" + getName());
       for (Mouse mouse: mice){
           if (mouse != null){
               mouseCounter ++;
               System.out.println("Мышь" + mouseCounter);
           }
       }
       if (mouseCounter == 0) System.out.println("Мышей нет");
   }


}
