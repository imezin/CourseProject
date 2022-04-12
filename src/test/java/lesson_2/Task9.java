package lesson_2;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Arr(5, 3)));
    }

    public static int[] Arr(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
