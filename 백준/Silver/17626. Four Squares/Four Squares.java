
import java.io.*;

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
    int num;
    int count;
    
    void setting () throws NumberFormatException, IOException {
    	num = Integer.parseInt(br.readLine());
    	int[] dp = new int[num + 1];

        dp[0] = 0;	
        
        for (int i = 1; i <= num; i++) {
            dp[i] = i; 

            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
    	sb.append(dp[num]);
    }

    void print() {
        System.out.print(sb);
    }
}
