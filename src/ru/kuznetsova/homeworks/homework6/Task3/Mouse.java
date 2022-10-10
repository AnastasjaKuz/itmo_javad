package ru.kuznetsova.homeworks.homework6.Task3;

public class Mouse {
    private int speed;

    public Mouse(int speed){
        setSpeed(speed);
    }

    public void setSpeed(int speed){
        if (speed < 1){
            throw new IllegalArgumentException("Скорость мыши не может быть меньше 1 км/ч");
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
