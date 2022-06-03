package lesson_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Task_1 {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<String>();
        country.add("Estonia");
        country.add("England");
        country.add("Finland");
        country.add("Finland");
        country.add("Iceland");
        country.add("Latvia");
        country.add("Lithuania");
        country.add("Norway");
        country.add("Scotland");
        country.add("Lithuania");
        country.add("Lithuania");
        country.add("Latvia");

        HashSet<String> unique = new  HashSet<String>(country);

        System.out.println(unique.toString()); //Уникальные значения
        for (String title : unique) {
            System.out.println(title + ": " + Collections.frequency(country, title)); //Страны с количеством повтерений
        }

    }
}
