
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
    HashSet<Integer> str1 = new HashSet<>();
    HashSet<Integer> str2 = new HashSet<>();
    
    int count = 0;
    void setting() throws IOException {
       String [] s =  br.readLine().split(" ");
       int num1 = Integer.parseInt(s[0]);
       int num2 = Integer.parseInt(s[1]);
       String num11 [] = br.readLine().split(" ");
       String num22 [] = br.readLine().split(" ");
       for(int i = 0; i <num1; i++) {
    	   str1.add(Integer.parseInt(num11[i]));
       }
       for(int i = 0; i < num2; i++) {
    	   str2.add(Integer.parseInt(num22[i]));
       }
       for(int i : str1) {
    	   if(str2.contains(i)) {
    		   count++;
    	   }
       }
       for(int i : str2) {
    	   if(str1.contains(i)) {
    		   count++;
    	   }
       }
       sb.append(num1+num2-count);
       
    }

    void print() {
        System.out.print(sb); 
    }
}
