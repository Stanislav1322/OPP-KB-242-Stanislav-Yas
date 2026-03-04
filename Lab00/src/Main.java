import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name;
        System.out.println("Введіть ваше ім'я:");
        name = in.nextLine();

        int x;
        System.out.println("Введіть ваш вік:");
        x = in.nextInt();

        System.out.println("Привіт " + name + ", тобі " + x + " років");
    }
}
