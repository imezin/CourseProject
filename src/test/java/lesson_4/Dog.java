package lesson_4;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void Swim(int swimdistanse) {
        if (swimdistanse <= 10) {
            System.out.println(name + " проплыл " + swimdistanse + " м.");
        } else {
            System.out.println("Собака не может плыть больше 10м.");
        }
    }

    @Override
    public void Run(int rundistanse) {
        if (rundistanse <= 500) {
            System.out.println(name + " пробежал " + rundistanse + " м.");
        } else {
            System.out.println("Собака не может бежать больше 500м.");
        }
    }
}