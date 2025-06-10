import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    final int MOD = 1_000_000_000;

    void setting() throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N + 1][10];

        // 초기 조건
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        // 점화식 적용
        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j > 0) dp[i][j] += dp[i - 1][j - 1];
                if (j < 9) dp[i][j] += dp[i - 1][j + 1];
                dp[i][j] %= MOD;
            }
        }

        // 정답 계산
        int result = 0;
        for (int i = 0; i <= 9; i++) {
            result = (result + dp[N][i]) % MOD;
        }

        sb.append(result);
    }

    void print() {
        System.out.println(sb);
    }
}
