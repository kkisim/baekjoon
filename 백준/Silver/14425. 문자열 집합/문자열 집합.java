

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
    HashSet<String> str = new HashSet<>();
    int count = 0;
    void setting() throws IOException {
       String [] s =  br.readLine().split(" ");
       int num1 = Integer.parseInt(s[0]);
       int num2 = Integer.parseInt(s[1]);
       
       for(int i = 0; i <num1; i++) {
    	   str.add(br.readLine());
       }
       for(int i = 0; i < num2; i++) {
    	   if(str.contains(br.readLine())) {
    		   count++;
    	   }
       }
       sb.append(count);
       
    }

    void print() {
        System.out.print(sb); 
    }
}
