import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;
        int result = 0;

        while (start < end) {
            if (arr[start] + arr[end] < m) start++;
            else if (arr[start] + arr[end] > m) end--;
            else if (arr[start] + arr[end] == m) {
                start++;
                end--;
                result++;
            }
        }

        System.out.println(result);
    }
}