import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int start = 1;
        int end = 1;
        int count = 1;
        int result = 0;
        while ((start + end) * count / 2 < n) {
            end++;
            count++;
        }
        if ((start + end) * count / 2 == n) result++;
        while (count > 1) {
            start += 1;
            count -= 1;
            while ((start + end) * count / 2 < n) {
                start++;
                end++;
            }
            if ((start + end) * count / 2 == n) result++;
        }
        System.out.println(result);
    }
}