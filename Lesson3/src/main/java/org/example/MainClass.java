package org.example;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catArr = new Cat[5];
        catArr[0] = new Cat("Barsik", 5);
        catArr[1] = new Cat("Murzik", 10);
        catArr[2] = new Cat("Chipsik", 20);

        catArr[0].catInfo();
        catArr[1].catInfo();
        catArr[2].catInfo();
        Plate plate = new Plate(50);
        catArr[0].eat(plate);
        catArr[1].eat(plate);
        catArr[2].eat(plate);
        catArr[2].isHungry();
        catArr[2].catInfo();
        plate.info();
        catArr[2].eat(plate);
        plate.fillPlate(50);
        catArr[2].eat(plate);
        catArr[0].catInfo();
        catArr[1].catInfo();
        catArr[2].catInfo();
    }
}
