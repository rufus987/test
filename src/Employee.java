public class Employee {
    String name;
    String position;
    String mail;
    String phone;
    int salary;
    int age;


    public Employee(String name, String position, String mail, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void getInfo() {
        System.out.println("ФИО сотрудника - " + name);
        System.out.println("Должность - " + position);
        System.out.println("Почта - " + mail);
        System.out.println("Телефон - " + phone);
        System.out.println("Зарплата - " + salary);
        System.out.println("Возраст - " + age);
    }

}
