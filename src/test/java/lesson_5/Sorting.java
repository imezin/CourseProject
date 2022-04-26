package lesson_5;

public class Sorting {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        appleBox.add(apple);
        appleBox.add(apple);
        orangeBox1.add(orange);
        orangeBox1.add(orange);
        orangeBox1.add(orange);
        orangeBox1.add(orange);

        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float oranWeigth1 = orangeBox1.getWeight();
        Float appleWeight = appleBox.getWeight();
        System.out.println("Вес первой коробки с апельсинами: " + oranWeigth1);
        System.out.println("Вес коробки с яблоками: " + appleWeight);

        System.out.println("Сравнение первой коробки с апельсинами и коробки с яблоками " + appleBox.compare(orangeBox1));

        orangeBox1.change(orangeBox2);
        orangeBox1.info();
        orangeBox2.info();
    }
}