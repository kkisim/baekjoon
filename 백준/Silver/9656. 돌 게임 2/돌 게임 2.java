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

    void setting() throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[] dp = new boolean[n + 4]; 

       
        dp[1] = false; 
        dp[2] = true;  
        dp[3] = false; 
        dp[4] = true;  

        for (int i = 5; i <= n; i++) {
            dp[i] = !dp[i - 1] || !dp[i - 3];
        }

        if (dp[n]) {
            sb.append("SK");
        } else {
            sb.append("CY");
        }
    }

    void print() {
        System.out.println(sb);
    }
}
