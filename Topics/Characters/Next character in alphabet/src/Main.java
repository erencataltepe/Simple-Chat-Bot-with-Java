import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input character
        char inputChar = scanner.next().charAt(0);
        // TODO: Write your code here
        char outputChar = ' ';
        if (inputChar == 'z') {
            outputChar = 'a';
        } else {
            outputChar = ++inputChar;
        }
        // Print the result
        System.out.println(outputChar);
    }
}