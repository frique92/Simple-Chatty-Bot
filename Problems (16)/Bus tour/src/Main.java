import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int numOfBridges = scanner.nextInt();

        boolean crash = false;
        int countBridgeCrush = 1;

        while (!crash && countBridgeCrush <=numOfBridges) {
            int hBridge = scanner.nextInt();
            if (height >= hBridge) {
                crash = true;
                System.out.println("Will crash on bridge " + countBridgeCrush);
            }
            countBridgeCrush++;
        }
        if (!crash) System.out.println("Will not crash");
    }
}