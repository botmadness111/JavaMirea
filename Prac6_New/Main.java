package Prac6_New;

public class Main {
    public static void main(String[] agrs) {
        Labrador dog1 = new Labrador("Bot", (short) 120, (short) 30);
        Ovcharka dog2 = new Ovcharka("Man", (short) 100, (short) 25);

        System.out.println(dog1);
        dog1.doJump();
        System.out.println(dog1);

        dog2.doVoice();
        System.out.println(dog2.getName());
    }
}
