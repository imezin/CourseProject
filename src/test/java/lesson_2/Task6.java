package lesson_2;

public class Task6 {
    public static void main(String[] args) {
        int[] num = new int[100];
        int a = 1;
        for (int i = 0; i < num.length; i++) {
            num[i] = a++;
            System.out.println(num[i]);
        }
    }
}
