package lesson_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Directory {
    private HashMap<String, List<String>> catalog;
    public Directory(){
        this.catalog = new HashMap<>();
    }

    public void add(String surname, String number){
        if(catalog.containsKey(surname)){
            List<String> numbers = catalog.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен для фамилии %s ", number, surname));
            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s", number, surname));
            }
        } else {
            catalog.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
        }
    }

    public List<String> get(String surname){
        if(catalog.containsKey(surname)){
            return catalog.get(surname);
        } else {
            System.out.println(String.format("Запись отсутствует", surname));
            return new ArrayList<>();
        }
    }
}
