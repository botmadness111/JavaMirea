package Prac6_New;

public class Ovcharka extends Dog {
    public Ovcharka(String name, short height, short weight) {
        super(name, height, weight);
    }

    @Override
    public void doJump() {
        coord_x += 20;
    }
}
