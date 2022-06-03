package lesson_8;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.add("Ivanov","1234223333");
        directory.add("Romonov","225555555");
        directory.add("Denisov","3235566666");
        directory.add("Ursov","423423432432");
        directory.add("Ssse","523422646546");
        directory.add("Denisov","323556666699");
        directory.add("Denisov","323556666699");
        directory.add("Veron","62342252523");

        System.out.println(directory.get("Denisov"));
    }
}
