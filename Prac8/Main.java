package Prac8;

public class Main {
    public static void main(String[] args) {
        Dragonfly dragonfly = new Dragonfly();
        dragonfly.setSize("Very Small");
        dragonfly.setCountLegs(10);
        dragonfly.setCountEyes(20);

        Plane plane = new Plane();
        plane.setSize("Very Big");
        plane.setCost(100000000);

        System.out.println(dragonfly);
        System.out.println(plane);


        Spider spider = new Spider();
        spider.go();
        Insects sp = new Spider();
        //sp.go(); - не видит такой метод

        AbilityToFly bigDragonfly = dragonfly; //доступны методы только у интерфейса
        bigDragonfly.setSize("Big");

        System.out.println(bigDragonfly);

        AbilityToFly newFlyObject = createFlyObject("normal", plane);
        System.out.println(newFlyObject);

        System.out.println("\n");

        dragonfly.getSound();
        plane.getSound();
        bigDragonfly.getSound();
        newFlyObject.getSound();
    }

    public static AbilityToFly createFlyObject(String size, AbilityToFly obj) {
        obj.getSound();
        obj.setSize(size);
        return obj;
    }
}
