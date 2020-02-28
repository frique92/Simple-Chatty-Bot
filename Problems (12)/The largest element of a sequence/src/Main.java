import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int largeNum = 0;

        while (scanner.hasNext()) {
            int curNum = scanner.nextInt();
            if (curNum != 0) {
                if (largeNum < curNum) largeNum = curNum;
            } else break;
        }

        System.out.println(largeNum);

    }
}