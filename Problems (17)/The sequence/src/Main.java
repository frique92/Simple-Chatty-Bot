import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfNum = scanner.nextInt();
        int num = 1;
        int repeatNum = 0;

        while (repeatNum < countOfNum) {
            for (int i = 0; i < num && repeatNum < countOfNum; i++) {
                repeatNum++;
                System.out.print(num + " ");
            }
            num++;
        }

    }
}