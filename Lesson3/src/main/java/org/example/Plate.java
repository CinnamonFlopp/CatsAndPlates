package org.example;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void fillPlate(int a)
    {
        food += a;
        System.out.println("Миска пополнена на: " + a);
    }
    public boolean decreaseFood(int n) {
        if(food < n)
        {
            System.out.println("В миске не осталось еды, котик не наелся");
            return false;
        }
        if(food == 0)
        {
            System.out.println("В миске нет еды");
            return false;
        }
        else
        {
            food -= n;
            return true;
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
