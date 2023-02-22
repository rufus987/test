import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRight = false;
        while (!isRight) {
            System.out.println("Введите имя пользователя");
            String name = scanner.nextLine();
            System.out.println("Введите пароль (от 8 до 15 символов)");
            String password = scanner.nextLine();
            if (8 > password.length() || password.length() > 16){
                System.out.println("Недопустимая длина пароля");
            }
            String rightPassword = "fT6u89r3E";
            String rightName = "Евгений";
            if (rightPassword.equals(password) && rightName.equals(name)){
                isRight = true;
                System.out.printf("%s\n%s", name, rightPassword);
            }else System.out.printf("%s, не пытайтесь нас обмануть.\nНеверное имя пользователя или пароль.\n", name);
        }
    }
}