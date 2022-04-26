package lesson_4;

public class Cat extends Animal {
    private int appetite;
    private boolean satiety;

    public Cat(String name, int rundistanse, int appetite, boolean satiety) {
        super(name, rundistanse);
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
    public void Run() {
        if (rundistanse <= 200) {
            System.out.println(name + " пробежал " + rundistanse + " м.");
        } else {
            System.out.println("Кот не может бежать больше 200м.");
        }
    }

    ;

}
