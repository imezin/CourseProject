package lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Box<T extends Fruit> {
    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Box(T... obj) {
        list = Arrays.asList(obj);
    }

    public Box() {
        list = new ArrayList<T>();
    }

    void add(T obj) {
        list.add(obj);
    }

    void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("Коробка содержит: " + list.get(0).toString() + " В количестве  : " + list.size());
        }
    }

    float getWeight(){
        if(list.isEmpty()){
            return 0;
        }else {
            return list.size()* list.get(0).getWaight();
        }
    }
    boolean compare(Box<? extends  Fruit> box){
        return this.getWeight() == box.getWeight();
    }

    void change(Box<T> box1) {
        box1.getList().addAll(list);
        list.clear();
    }
}




