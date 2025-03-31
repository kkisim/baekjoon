
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
    	String s = br.readLine();
    	int size = 10;
    	for(int i = 0; i <s.length(); i+=size) {
    		int end = Math.min(i + size, s.length());
    		String s1 = s.substring(i, end);
    		sb.append(s1).append('\n');
      
      }
    }
    void print() {
        System.out.println(sb);
    }
}
