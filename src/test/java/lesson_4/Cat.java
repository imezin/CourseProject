package lesson_4;

public class Cat extends Animal {
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        super(name);
        this.appetite = appetite;
        this.satiety = satiety;

    }


    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public void CatInfo() {
        System.out.println("Данные кота: " + name + " " + appetite + " " + satiety);
    }

    @Override
    public void Swim(int swimdistanse) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public void Run(int rundistanse) {
        if (rundistanse <= 200) {
            System.out.println(name + " пробежал " + rundistanse + " м.");
        } else {
            System.out.println("Кот не может бежать больше 200м.");
        }
    }

    ;

}
