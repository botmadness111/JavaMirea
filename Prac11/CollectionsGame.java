package Prac11;

abstract public class CollectionsGame {
    public int[] getArray(String player) {
        int[] array = new int[player.length()];
        int index = 0;
        for (char chr : player.toCharArray()) {
            array[index] = Integer.parseInt(chr + "");
            index++;
        }
        return array;
    }
}
