import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, number;

        while ((number = scanner.nextInt()) != 0) {
            sum += number;
            count++;
        }

        System.out.println(sum / count);
    }
}