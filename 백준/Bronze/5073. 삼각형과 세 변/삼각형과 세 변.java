

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

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
     
      while(true) {
    	  String s [] = br.readLine().split(" ");
          int [] num = new int [s.length];
          for(int i = 0; i < num.length; i++) {
        	  num[i] = Integer.parseInt(s[i]);
          }
          if(num[0] == 0 && num[1] ==0 && num[2] ==0) {
        	  break;
          }
          Arrays.sort(num);
          int hap = num[1] + num[2];
          if (num[0] + num[1] <= num[2]) {
              sb.append("Invalid").append('\n');
              continue;
          }
          if(num[0] == num [1] && num[0] == num[2]) {
        	  sb.append("Equilateral").append('\n');
          }else if(num[0] == num[1] || num[1] == num[2]) {
        	  sb.append("Isosceles").append('\n');
          }else if(num[0] != num[1] && num[1] != num[2] && num[0] != num[2]) {
        	  sb.append("Scalene").append('\n');
          }
      }
    }
    void print() {
        System.out.println(sb);
    }
}
