import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j, n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        n = scanner.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.println();
            for (j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (j = n; j > n - i; j--) {
                System.out.print("  " + j);
            }
            for (j = n - i + 2; j < n + 1; j++) {
                System.out.print("  " + j);
            }
        }
        for (i = 1; i <= n; i++) {
            System.out.println();
            for (j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (j = n; j > i; j--) {
                System.out.print("  " + j);
            }
            for (j = i + 2; j <= n; j++) {
                System.out.print("  " + j);
            }
        }
    }
}
