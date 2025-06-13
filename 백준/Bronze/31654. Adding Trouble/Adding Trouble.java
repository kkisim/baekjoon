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
    	String s [] = br.readLine().split(" ");
    	
    	int a = Integer.parseInt(s[0]);
    	int b = Integer.parseInt(s[1]);
    	int c = Integer.parseInt(s[2]);
    	
    	if((a + b) ==c) {
    		sb.append("correct!");
    	}else {
    		sb.append("wrong!");
    	}
    	
    	
      
    }
    

    void print() {
        System.out.println(sb);
    }
}
