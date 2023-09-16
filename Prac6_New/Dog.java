package Prac6_New;

abstract public class Dog {
    short height;
    short weight;
    String name;
    short coord_x = 0;
    short coord_y = 0;

    public Dog(String name, short height, short weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void doVoice() {
        System.out.println("Гав! Гав!");
    }

    public int[] getBody() {
        return new int[]{height, weight};
    }

    public String getName() {
        return name;
    }

    abstract public void doJump();

    @Override
    public String toString() {
        return "My name is " + name + "My coords: " + coord_y;
    }
}
