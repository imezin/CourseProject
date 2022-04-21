package lesson_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Payment {
    static ArrayList<Product> bye = new ArrayList<>();

    public static void getProduct() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.print("Введите наименование: ");
            String str_name = scan.next();
            System.out.print("Введите код товара: ");
            int str_cod = scan.nextInt();
            System.out.print("Введите цену: ");
            int str_cost = scan.nextInt();
            bye.add(i, new Product(str_name, str_cod, str_cost));
            i++;
        }
    }

    public static void printBye() {
        System.out.println(bye);
    }

    public static class Product {
        String name;
        int cod;
        int cost;

        public Product(String name, int cod, int cost) {
            this.name = name;
            this.cod = cod;
            this.cost = cost;
        }


        @Override
        public String toString() {
            return "Продукт" +
                    "Наименование: " + name +
                    ", Код товара: " + cod +
                    ", Цена: " + cost +
                    "  |  ";
        }

        public String getName() {
            return name;
        }

        public int getCod() {
            return cod;
        }

        public int getCost() {
            return cost;
        }
    }

}
