import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read user input values
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        System.out.print("Enter d: ");
        int d = scanner.nextInt();

        boolean result;

        // Expression to solve
        result = (((a + b * c) / d % 3) > c && (a - d) < b || a >= b) != (a <= c);

        System.out.println("Final Result: " + result);
    }
}
