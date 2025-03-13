
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Apartment ap = new Apartment();
        ap.setting();
        ap.print();
    }
}

class Apartment {
    static Scanner sc = new Scanner(System.in);
    int T; 
    int[] kArr; 
    int[] nArr; 
    int[][] dp;

    void setting() {
        T = sc.nextInt();
        kArr = new int[T];
        nArr = new int[T];

        for (int i = 0; i < T; i++) {
            kArr[i] = sc.nextInt(); 
            nArr[i] = sc.nextInt(); 
        }

        dp = new int[15][15];

        for (int i = 1; i < 15; i++) {
            dp[0][i] = i; 
        }

        for (int k = 1; k < 15; k++) {
            for (int n = 1; n < 15; n++) {
                dp[k][n] = dp[k][n - 1] + dp[k - 1][n];
            }
        }
    }



    void print() {
        for (int i = 0; i < T; i++) {
            System.out.println(dp[kArr[i]][nArr[i]]);
        }
    }
}
