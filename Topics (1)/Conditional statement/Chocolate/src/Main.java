import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int segment = scanner.nextInt();

        if (width == segment || height == segment) {
            System.out.println("YES");
        } else if (segment < height * width && segment % width == 0) {
            System.out.println("YES");
        } else if (segment < width * height && segment % height == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}