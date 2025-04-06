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
      int n = Integer.parseInt(br.readLine());
      for(int i = 0 ; i <n; i++) {
    	  String s []  = br.readLine().split(" ");
    	  int a = Integer.parseInt(s[0]);
    	  int b= Integer.parseInt(s[1]);
    	  
    	  sb.append(co(b,a)).append('\n');
      }
      
      
    }
    int co (int n, int r) {
    	long result = 1;
    	for (int i  = 1; i <= r; i++) {
    		result = result * (n - i + 1) / i;
        }
        return (int) result;
    	
    }

    void print() {
        System.out.print(sb);
    }
}
