import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int n = scanner.nextInt();
        int curr = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int next = scanner.nextInt();
            while (curr <= next) {
                stringBuilder.append("+\n");
                stack.push(curr);
                curr++;
            }
            if (next == stack.peek()) {
                stringBuilder.append("-\n");
                stack.pop();
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(stringBuilder);
    }
}