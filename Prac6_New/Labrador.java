package Prac6_New;

public class Labrador extends Dog {
    public Labrador(String name, short height, short weight) {
        super(name, height, weight);
    }

    @Override
    public void doJump() {
        this.coord_y += 10;
    }
}
