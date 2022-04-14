package Lesson_3;

public class EmployeesList {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 39);
        persArray[1] = new Employee("Vlad Volok", "Developer", "ivivan@mailbox.com", "822222222", 60000, 50);
        persArray[2] = new Employee("Iret Refar", "BA", "ivivan@mailbox.com", "833333333", 80000, 60);
        persArray[3] = new Employee("Vasia Tret", "QA", "ivivan@mailbox.com", "844444444", 70000, 40);
        persArray[4] = new Employee("Oleg Yery", "Engineer", "ivivan@mailbox.com", "855555555", 60000, 41);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
    }
}
