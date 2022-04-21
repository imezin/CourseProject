package lesson_4;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void Swim(int swimdistanse) {
        System.out.println(name + " проплыл на " + swimdistanse + " м.");
    }

    public void Run(int rundistanse) {
        System.out.println(name + " пробежал " + rundistanse + " м.");
    }

}
