import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bill = scanner.nextDouble();
        int friends = scanner.nextInt();

        if (bill < 0) {
            System.out.println("Invalid bill");
        } else if (friends <= 0) {
            System.out.println("Invalid number of friends");
        } else {
            double total = bill * 1.1;
            System.out.println((int)(total / friends));
        }
    }
}