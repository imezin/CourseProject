package lesson_6;


import static lesson_6.Method.method;

public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        try {
            try {
                int result = method(array);
                System.out.println(result);
            } catch (MyArraySizeException exception) {
                System.out.println("Длинна масива привышена");
            }
        }
        catch (MyArrayDataException exception) {
            System.out.println("Не верное значение");
            System.out.println("Ошибка в ячейке: " + exception.i + "x" + exception.j);
        }
    }

}
