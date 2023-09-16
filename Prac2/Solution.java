package Prac2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 10; i++) {
            System.out.printf(sum + " ");
            sum += i;
        }

        System.out.println("\n");

        sum = 0;
        int i = 1;
        while (i < 10) {
            System.out.printf(sum + " ");
            sum += i;
            i++;
        }

        System.out.println("\n");

        sum = 0;
        i = 1;
        do {
            System.out.printf(sum + " ");
            sum += i;
            i++;
        } while (i < 10);

        System.out.println("\n");

        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            String arg = scan.next();
            System.out.printf(arg + " ");
        }

        System.out.println("\n");
        for (i = 1; i < 11; i++) {
            System.out.printf((float) 1 / i + " ");
        }

        System.out.println("\n");

        float[] array = new float[10];
        for (i = 0; i < 10; i++) {
            float num = (float) Math.random();
            array[i] = num;
        }
        for (float num : array) {
            System.out.printf(num + " ");
        }

        System.out.println("\n");

        Arrays.sort(array);
        for (float num : array) {
            System.out.printf(num + " ");
        }

        System.out.println("\n");

        factorial(4);
    }

    public static void factorial(int num) {
        int sum = 1;
        while (num != 0) {
            sum *= num;
            num--;
        }
        System.out.println(sum);
    }
}
