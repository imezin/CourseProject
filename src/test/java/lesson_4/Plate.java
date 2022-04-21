package lesson_4;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        boolean result;
        if(n<food){
         food -= n;
         return result = true;
        }else {
            return result = false;
        }
    }

    public void addingFood (int i){
        food += i;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
