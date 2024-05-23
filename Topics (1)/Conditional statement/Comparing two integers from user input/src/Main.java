import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // TODO: Compare the values of 'a' and 'b' using conditional statements
        // Print the appropriate message based on the comparison
        if (a > b) {
            System.out.println("a is greater");
        } else if (b > a) {
            System.out.println("b is greater");
        } else {
            System.out.println("a and b are equal");
        }

    }
}