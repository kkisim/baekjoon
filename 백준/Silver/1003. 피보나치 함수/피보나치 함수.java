
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Fibonacci f = new Fibonacci();
        f.input();
        f.cal();
        f.print();
    }
}

class Fibonacci {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t;
    int[] input;
    int[][] dp = new int[41][2]; 

    void input() throws IOException {
        t = Integer.parseInt(br.readLine());
        input = new int[t];
        for (int i = 0; i < t; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
    }

    void cal() {
   
        dp[0][0] = 1; 
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        for (int i = 0; i < t; i++) {
            sb.append(dp[input[i]][0]).append(" ").append(dp[input[i]][1]).append('\n');
        }
    }

    void print() {
        System.out.print(sb);
    }
}