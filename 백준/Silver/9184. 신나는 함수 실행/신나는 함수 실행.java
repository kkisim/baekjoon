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
    static int[][][] dp = new int[21][21][21];
    void setting() throws IOException {
    	 while(true) {
    		 String [] s = br.readLine().split(" ");
    		 int a = Integer.parseInt(s[0]);
    		 int b = Integer.parseInt(s[1]);
    		 int c = Integer.parseInt(s[2]);
    		 
    		 if(a == -1 && b == -1 && c==-1) {
    			 break;
    		 }
    		
    		 sb.append( "w"+"("+a+", "+b+", "+c+")").append(" = ").append(W(a,b,c)).append('\n');
    	 }
    	 
    }
    int W(int a, int b, int c) {
    	if(a <=0 || b <=0 || c<=0) {
    		return 1;
    	}
    	if(a > 20 || b >20 || c>20) {
    	return W(20,20,20);
    	}
    	 if(dp[a][b][c] != 0) return dp[a][b][c];
    	if(a<b && b<c) {
    		 dp[a][b][c] =W(a,b,c-1)+W(a,b-1,c-1)-W(a,b-1,c);
    	}else {
    		dp[a][b][c]= W(a-1,b,c) + W(a-1,b-1,c) +W(a-1,b,c-1) -W(a-1,b-1,c-1);
    	}
    	return dp[a][b][c];
    }
 
    void print() {
        System.out.println(sb);
    }
}