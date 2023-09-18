package Prac11;

import java.util.Stack;

public class GameStack extends CollectionsGame {
    public void game(String player1, String player2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int[] arrayPlayer1 = getArray(player1);
        int[] arrayPlayer2 = getArray(player2);

        for (int num : arrayPlayer1) {
            stack1.push(num);
        }
        for (int num : arrayPlayer2) {
            stack2.push(num);
        }

        int step = 0;
        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            int num1 = stack1.pop();
            int num2 = stack2.pop();

            if (num1-9 > num2-9) {
                stack1.push(num1);
                stack1.push(num2);
            } else {
                stack2.push(num2);
                stack2.push(num1);
            }
            step++;
        }
    }
}
