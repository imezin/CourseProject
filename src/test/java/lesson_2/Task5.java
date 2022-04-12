package lesson_2;

public class Task5 {
    public static void main(String[] args) {
        int[] number = {0, 1, 1, 0, 0};
        for (int i = 0; i < number.length; i++) {
            switch (number[i]) {
                case 1:
                    number[i] = 0;
                    break;
                case 0:
                    number[i] = 1;
                    break;
            }
            System.out.println(number[i]);
        }

    }
}
