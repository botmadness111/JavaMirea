package Prac8;

public class Dragonfly implements AbilityToFly, Insects {
    String size = "NotDefined";
    int countLegs = -1;
    int countEyes = -1;

    Dragonfly() {
    }

    @Override
    public void getSound() {
        System.out.println("Бззз-бЗЗзззББЗзз");
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public int getCountLegs() {
        return this.countLegs;
    }

    @Override
    public int getCountEyes() {
        return this.countEyes;
    }

    @Override
    public void setCountLegs(int count) {
        this.countLegs = count;
    }

    @Override
    public void setCountEyes(int count) {
        this.countEyes = count;
    }

    @Override
    public String toString() {
        return "Dragonfly: " + size + " " + countLegs + " " + countEyes;
    }
}
