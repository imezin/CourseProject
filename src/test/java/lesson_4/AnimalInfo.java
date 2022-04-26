package lesson_4;

public class AnimalInfo {

    public static void main(String[] args) {
        Cat [] cat = new Cat[3];
        cat[0] = new Cat ("Том", 20, 150,false);
        cat[1] = new Cat ("Тод", 40, 40,  false);
        cat[2] = new Cat ("Джон", 50, 50, false);
        Plate plate = new Plate(100);

        cat[0].Run();
        // Информация о количестве еды в тарелке
        plate.info();
        // Коты едят
        cat[0].eat(plate);
        cat[1].eat(plate);
        cat[2].eat(plate);
        // Данные котов
        cat[0].CatInfo();
        cat[1].CatInfo();
        cat[2].CatInfo();
        // Информация о количестве еды в тарелке
        plate.info();
        //Добавление еды в тарелку
        plate.addingFood(100);
        // Информация о количестве еды в тарелке
        plate.info();
        // Данные собаки
        Dog dog = new Dog("Бобик", 400, 30);
        dog.Swim();
        dog.Run();
    }
}
