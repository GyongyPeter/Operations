import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a);
        System.out.println(b);
        int c = a+b;
        System.out.println("Result: " + c);


    }
}