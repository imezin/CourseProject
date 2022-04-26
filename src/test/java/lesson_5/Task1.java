package lesson_5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] fruit = new String[]{"Apple", "Banana", "Grapes", "Orange"};
        swapElements(fruit, 0, 3);
        System.out.println(Arrays.toString(fruit));
    }

    private static <T> void swapElements(T[] array, int a, int b) {
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

