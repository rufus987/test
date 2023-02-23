public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иван Иванов", "Программист", "msdsd@mail.ru", "+79895222556", 78000, 28);
        employeesArray[1] = new Employee("Борис Джонсон", "Продакт-менеджер", "fddfsds@gmail.com", "+78005553535", 80000, 47);
        employeesArray[2] = new Employee("Данил Датский", "Системный администратор", "jsdjjgjdjf@mail.ru", "+90005255421", 65000, 41);
        employeesArray[3] = new Employee("Олег Олегов", "Дизайнер", "thaksoleg@yandex.ru", "+78521566324", 69000, 33);
        employeesArray[4] = new Employee("Елена Астахова", "Маркетолог", "shjdsdjhds@mail.ru", "+78545452212", 50000, 24);

        for (Employee employee : employeesArray) {
            if (employee.age > 40) {
                employee.getInfo();
            }
        }
    }
}
