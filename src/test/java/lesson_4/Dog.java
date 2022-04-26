package lesson_4;

public class Dog extends Animal {
    int swimdistanse;
    public Dog(String name, int rundistanse, int swimdistanse) {
        super(name, rundistanse);
        this.swimdistanse = swimdistanse;
    }

    public void Swim() {
        if (swimdistanse <= 10) {
            System.out.println(name + " проплыл " + swimdistanse + " м.");
        } else {
            System.out.println("Собака не может плыть больше 10м.");
        }
    }

    @Override
    public void Run() {
        if (rundistanse <= 500) {
            System.out.println(name + " пробежал " + rundistanse + " м.");
        } else {
            System.out.println("Собака не может бежать больше 500м.");
        }
    }
}