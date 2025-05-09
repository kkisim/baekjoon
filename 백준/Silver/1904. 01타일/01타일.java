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
    
    void setting() throws IOException {
    	int num = Integer.parseInt(br.readLine());
    	int [] dp = new int [num+2];
    	dp [1]= 1;
    	dp [2] = 2;
    	for(int i = 3; i <=num; i++) {
    		dp[i] = (dp[i-2]+dp[i-1])%15746;
    	}
    	sb.append(dp[num]);
    }
    
    void print() {
        System.out.println(sb);
    }
}