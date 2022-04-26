package lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if(n<food){
         food -= n;
         return true;
        }
        return false;
    }

    public void addingFood (int i){
        food += i;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
