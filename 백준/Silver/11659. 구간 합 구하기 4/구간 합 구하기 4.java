import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] sum = new int[n];
        sum[0] = scanner.nextInt();
        for (int i = 1; i < n; i++) sum[i] = sum[i - 1] + scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            if (from == 1)
                System.out.println(sum[to - 1]);
            else
                System.out.println(sum[to - 1] - sum[from - 2]);
        }
    }
}