

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
           hap h = new hap();
           h.setting();
           h.cal();
           h.print();
    }
}

class hap {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int numar;
    int numpro;
    int [] arr ;
    int [] sum;
    void setting() throws IOException {
      String [] s = br.readLine().split(" ");
      numar = Integer.parseInt(s[0]);
      numpro = Integer.parseInt(s[1]);
      arr = new int [numar];
      sum = new int [numar+1];
      String [] input = br.readLine().split(" ");
      for(int i = 0; i<numar; i++) {
    	  arr[i] = Integer.parseInt(input[i]);
    	  sum[i+1] = sum[i]+arr[i];
      }
      
    }
    void cal() throws IOException {
        for(int i =0; i <numpro ; i++) {
        	String[] s = br.readLine().split(" ");
        	
        	int num1 = Integer.parseInt(s[0])-1;
        	int num2 = Integer.parseInt(s[1]);
        	int result = sum[num2]-sum[num1];
        	
        	sb.append(result).append('\n');
        	
        }
    }
    void print() {
    	System.out.println(sb);
    }
}
