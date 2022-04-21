package lesson_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Park {
    static ArrayList<Park.Attractions> park = new ArrayList<>();
    public static void infoAttractions() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.print("Введите наименование атракциона: ");
            String str_name = scan.next();
            System.out.print("Введите время работы: ");
            String operatingTime = scan.next();
            System.out.print("Введите цену: ");
            int in_cost = scan.nextInt();
            park.add(i, new Park.Attractions(str_name, operatingTime, in_cost));
            i++;
        }
    }

    public static void print() {
        System.out.println(park);
    }

    public static class Attractions {
        String name;
        String operatingTime;
        int cost;

        public Attractions(String name, String operatingTime, int cost) {
            this.name = name;
            this.operatingTime = operatingTime;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attractions:" +
                    "Наименование атракциона:" + name  +
                    ", Время работы: " + operatingTime  +
                    ", Цена : " + cost +
                    "  |  ";
        }
    }
}
