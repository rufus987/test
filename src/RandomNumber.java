import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random rd = new Random();
        int x = rd.nextInt(10);
        int attempt = 3;
        Scanner scanner = new Scanner(System.in);
        while (attempt > 0) {
            int y = scanner.nextInt();
            if (y == x) {
                System.out.println("Угадал");
                return;
            }
            System.out.println("Не угадал!");
            if (y>x){
                System.out.println("Это число меньше");
            } else System.out.println("Это число больше");
            attempt--;
        }
    }
}
