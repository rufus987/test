import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int x = rd.nextInt(words.length);
        System.out.println("Я загадал слово. Твоя задача - угадать");

        while (true) {
            String attempt = sc.nextLine();
            int m = 0;
            int n = 0;
            if (attempt.equals(words[x])) {
                System.out.println(attempt);
                break;
            }
            int t = 0;
            while (t < 16) {
                char a = attempt.charAt(m);
                char b = words[x].charAt(n);
                if (a == b) {
                    System.out.print(a);
                    if (m < attempt.length()-1){
                        m++;
                    }
                    n++;
                }
                else {
                    System.out.print("#");
                }
                t++;
            }
            System.out.println("\nНеверно, попробуй еще");
        }
    }
}
