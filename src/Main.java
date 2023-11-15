import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

        if (((X + Y) - Z) >= 0) {
            System.out.println((X + Y) - Z);
        } else {
            System.out.println("Impossible");
        }
    }
}