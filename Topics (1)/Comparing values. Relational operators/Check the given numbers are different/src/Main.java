import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean firstCheck = num1 == num2;
        boolean secondCheck = num1 == num3;
        boolean thirdCheck = num2 == num3;

        boolean result = !(firstCheck || secondCheck || thirdCheck);
        System.out.println(result);
    }
}