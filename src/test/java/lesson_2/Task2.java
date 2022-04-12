package lesson_2;

public class Task2 {
    public static void main(String[] args) {
        PositNegat(-4);
    }

    public static void PositNegat(int a) {
        if (a >= 0) {
            System.out.println("Число позитивное");
        } else {
            System.out.println("Число негативное");
        }
    }
}
