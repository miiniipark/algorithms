import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        System.out.println(scanner.next().chars().map(x -> x - '0').sum());
    }
}