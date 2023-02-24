import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        double[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double max = Arrays.stream(nums).max().orElseThrow();
        System.out.printf("%.14f", Arrays.stream(nums).map(x -> x / max * 100).sum() / nums.length);
    }
}