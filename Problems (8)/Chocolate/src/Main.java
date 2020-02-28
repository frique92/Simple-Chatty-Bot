import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int segments = scanner.nextInt();

        boolean isBreakOff = (segments % width  == 0 || segments % height == 0) && (width * height >= segments);

        if (isBreakOff) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}