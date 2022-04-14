package Lesson_3;

public class Employee {

    private String fullname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullname, String position, String email, String phone, int salary, int age) {
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя пользователя: " + fullname + "; Должность: " + position +
                "; Email:" + email + "; Телефон:" + phone + "; Зарплата:" + salary + "; Возраст: " + age);
    }

    public String getFullname() {
        return fullname;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}