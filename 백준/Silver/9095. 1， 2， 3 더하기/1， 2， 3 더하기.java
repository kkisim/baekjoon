
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Add123 a = new Add123();
        a.input();
        a.cal();
        a.print();
    }
}

class Add123 {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int t;
    int[] nums;
    int[] dp = new int[12]; 

    void input() throws IOException {
        t = Integer.parseInt(br.readLine());
        nums = new int[t];
        for (int i = 0; i < t; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
    }

    void cal() {
        
        dp[0] = 1; 

        for (int i = 1; i < dp.length; i++) {
            if (i - 1 >= 0) dp[i] += dp[i - 1];
            if (i - 2 >= 0) dp[i] += dp[i - 2];
            if (i - 3 >= 0) dp[i] += dp[i - 3];
        }

        for (int n : nums) {
            sb.append(dp[n]).append('\n');
        }
    }

    void print() {
        System.out.print(sb);
    }
}
