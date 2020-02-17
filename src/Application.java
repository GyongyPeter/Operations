import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();

        if (operation.equals("sum")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);

        } else if (operation.equals("mul")) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a * b);
        }
    }
// faszsag
}