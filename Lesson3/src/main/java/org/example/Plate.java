package org.example;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void fillPlate(int a)
    {
        food += a;
        System.out.println("����� ��������� ��: " + a);
    }
    public boolean decreaseFood(int n) {
        if(food < n)
        {
            System.out.println("� ����� �� �������� ���, ����� �� ������");
            return false;
        }
        if(food == 0)
        {
            System.out.println("� ����� ��� ���");
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
