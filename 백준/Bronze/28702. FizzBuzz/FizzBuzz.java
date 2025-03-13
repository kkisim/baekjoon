
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = new String[3];
        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextLine();
        }

        int[] candidates = new int[3];
        boolean found = false;

        for (int i = 0; i < 3; i++) {
            if (isNumeric(input[i])) {
                int num = Integer.parseInt(input[i]);
                for (int j = 0; j <= i; j++) {
                    candidates[j] = num - j;
                }
                found = true;
                break;
            }
        }

        if (!found) {
            for (int i = 1; ; i++) {
                if (match(i, input)) {
                    System.out.println(fizzBuzz(i + 3));
                    break;
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                if (candidates[i] == 0) continue;
                if (match(candidates[i], input)) {
                    System.out.println(fizzBuzz(candidates[i] + 3));
                    break;
                }
            }
        }
    }

    static boolean match(int start, String[] input) {
        for (int i = 0; i < 3; i++) {
            if (!fizzBuzz(start + i).equals(input[i])) {
                return false;
            }
        }
        return true;
    }

    static String fizzBuzz(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 5 == 0) return "Buzz";
        return String.valueOf(n);
    }

    static boolean isNumeric(String s) {
        return s.matches("\\d+");
    }
}
