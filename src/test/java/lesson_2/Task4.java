package lesson_2;

public class Task4 {
    public static void main(String[] args) {
        Line("Hi", 10);
        System.out.println(Year(2000));
    }

    public static void Line(String text, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static boolean Year(int year) {
        if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 > 0) {
            return true;
        } else {
            return false;
        }
    }
}
