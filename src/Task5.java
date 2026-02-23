import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (a <= b && a < h) {
            System.out.println("Impossible");
        } else {
            int days = (h - b - 1) / (a - b) + 1;
            System.out.println(days);
        }
    }
}
