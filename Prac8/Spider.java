package Prac8;

public class Spider implements Insects {
    int countLegs = -1;
    int countEyes = -1;

    public void go() {
        System.out.println("gogogo");
    }

    @Override
    public int getCountLegs() {
        return countLegs;
    }

    @Override
    public int getCountEyes() {
        return countEyes;
    }

    @Override
    public void setCountLegs(int count) {
        countLegs = count;
    }

    @Override
    public void setCountEyes(int count) {
        countEyes = count;
    }
}
