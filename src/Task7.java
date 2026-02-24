import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int number;

        while ((number = scanner.nextInt()) != 0) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);
    }
}