import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[] s = new long[n];
        long[] c = new long[m];
        long answer = 0;

        s[0] = scanner.nextInt();
        for (int i = 1; i < n; i++)
            s[i] = scanner.nextInt() + s[i - 1];

        for (int i = 0; i < n; i++) {
            int remainder = (int) (s[i] % m);
            if (remainder == 0) answer++;
            c[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            answer += c[i] * (c[i] - 1) / 2;
        }

        System.out.println(answer);
    }
}