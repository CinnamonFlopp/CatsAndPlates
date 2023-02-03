package org.example;


import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private boolean isWellFed;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        isWellFed = false;
    }

    public void isHungry()
    {
        isWellFed = false;
    }

    public void catInfo()
    {
        System.out.println("���: " + name + "\n" + "�� ������ " + appetite + "\n" + "�� ������? " + isWellFed);
    }


    public void eat(Plate p) {
        isWellFed = p.decreaseFood(appetite);
    }
}
