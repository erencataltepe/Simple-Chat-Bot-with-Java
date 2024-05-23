import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        String firstLine = scanner.nextLine();

        // Read the second line

        String secondLine = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Remove all whitespaces from both lines
        String firstLineNoWhitespace = firstLine.replaceAll("\\s", "");
        String secondLineNoWhitespace = secondLine.replaceAll("\\s", "");

        // Compare the two lines without whitespaces and print the result
        boolean areEqual = firstLineNoWhitespace.equals(secondLineNoWhitespace);
        System.out.println(areEqual);
    }
}