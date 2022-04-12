package lesson_2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Sum(4, 5));
    }

    public static boolean Sum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
