import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int p = scanner.nextInt();
        String str = scanner.next();
        int aNum = scanner.nextInt();
        int cNum = scanner.nextInt();
        int gNum = scanner.nextInt();
        int tNum = scanner.nextInt();
        int result = 0;

        String subStr = str.substring(0, p);
        int aCount = (int) subStr.chars().filter(x -> x == 'A').count();
        int cCount = (int) subStr.chars().filter(x -> x == 'C').count();
        int gCount = (int) subStr.chars().filter(x -> x == 'G').count();
        int tCount = (int) subStr.chars().filter(x -> x == 'T').count();
        if (aCount >= aNum && cCount >= cNum && gCount >= gNum && tCount >= tNum) {
            result++;
        }

        for (int i = 1; i <= s - p; i++) {
            switch (str.charAt(i - 1)) {
                case 'A':
                    aCount--;
                    break;
                case 'C':
                    cCount--;
                    break;
                case 'G':
                    gCount--;
                    break;
                case 'T':
                    tCount--;
                    break;
            }
            switch (str.charAt(i - 1 + p)) {
                case 'A':
                    aCount++;
                    break;
                case 'C':
                    cCount++;
                    break;
                case 'G':
                    gCount++;
                    break;
                case 'T':
                    tCount++;
                    break;
            }
            if (aCount >= aNum && cCount >= cNum && gCount >= gNum && tCount >= tNum) {
                result++;
            }
        }
        System.out.println(result);
    }
}
