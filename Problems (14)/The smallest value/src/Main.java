import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();

        long factorial = 1;
        int count = 0;

        while (factorial <= m) {
            count++;
            factorial = 1;
            for (int i = 1; i <= count; i++) {
                factorial *= i;
            }
        }

        System.out.println(count);
    }
}