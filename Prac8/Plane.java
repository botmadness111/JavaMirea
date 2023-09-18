package Prac8;

public class Plane implements AbilityToFly, Technic {
    String size;
    long cost = -1;

    Plane() {
    }

    @Override
    public void getSound() {
        System.out.println("ВжжжуууххххВжжжвЖЖУЖЖ");
    }


    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public long getCost() {
        return this.cost;
    }

    @Override
    public void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Palne: " + size + " " + cost;
    }
}
