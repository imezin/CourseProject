package lesson_4;

public class Animal {
    protected String name;
    protected int rundistanse;

    public Animal(String name, int rundistanse) {
        this.name = name;
        this.rundistanse = rundistanse;
    }

    public void Run() {
        System.out.println(name + " пробежал " + rundistanse + " м.");
    }

}
