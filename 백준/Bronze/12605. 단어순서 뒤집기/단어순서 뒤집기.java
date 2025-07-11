import java.io.*;
import java.math.BigInteger;

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
    
    for(int i = 1; i <= num; i ++) {
    	String s []  = br.readLine().split(" ");
    	
    	sb.append("Case #").append(i).append(":");
    	for(int j = s.length; j>0; j--) {
    		sb.append(" ").append(s[j-1]);
    	}
    	sb.append("\n");
    			
    }
    
   
   
    
    
    }
    void print() {
        System.out.println(sb);
    }
}
