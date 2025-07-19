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
       String []s = br.readLine().split("");
       int sum = 10;
       
       for(int i = 1 ; i < s.length; i++) {
    	   if(s[i-1].equals(s[i])) {
    		   sum+=5;
    	   }else {
    		   sum+=10;
    	   }
       }
       sb.append(sum);
    }

    void print() {
        System.out.println(sb);
    }
}
