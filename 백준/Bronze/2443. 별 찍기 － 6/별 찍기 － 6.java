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
    int n, m;
    int[] arr = new int[10];

    void setting() throws IOException {
      int num = Integer.parseInt(br.readLine());
      
      for(int i  = 0; i <num;i++) {
    	  for(int k = 0; k<i;k++) {
    		  sb.append(" ");
    	  }
    	  for(int j = 0; j < 2*(num-i)-1; j++) {
    		  sb.append("*");
    	  }
    	  sb.append("\n");
      }
    }

   

    void print() {
        System.out.print(sb);
    }
}
