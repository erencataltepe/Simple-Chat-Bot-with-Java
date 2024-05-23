import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int peanutCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean result = false;
        if (isWeekend) {
            if (peanutCups >= 15 && peanutCups <= 25) {
                result = true;
            }
        } else {
            if (peanutCups >= 10 && peanutCups <= 20) {
                result = true;
            }
        }

        System.out.println(result);
    }
}