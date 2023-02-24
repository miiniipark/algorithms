import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = scanner.nextInt()
                        + (i - 1 < 0 ? 0 : sum[i - 1][j])
                        + (j - 1 < 0 ? 0 : sum[i][j - 1])
                        - (i - 1 < 0 || j - 1 < 0 ? 0 : sum[i - 1][j - 1]);
            }
        }
        for (int i = 0; i < m; i++) {
            int x1 = scanner.nextInt() - 2;
            int y1 = scanner.nextInt() - 2;
            int x2 = scanner.nextInt() - 1;
            int y2 = scanner.nextInt() - 1;
            int result = sum[x2][y2]
                    - (x1 < 0 ? 0 : sum[x1][y2])
                    - (y1 < 0 ? 0 : sum[x2][y1])
                    + (x1 < 0 || y1 < 0 ? 0 : sum[x1][y1]);
            System.out.println(result);
        }
    }
}