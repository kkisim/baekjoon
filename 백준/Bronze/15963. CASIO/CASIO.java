
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
    	long num1 = Long.parseLong(s[0]);
    	long num2 = Long.parseLong(s[1]);
    	if(num1 == num2 ) {
    		sb.append(1);
    	}else {
    		sb.append(0);
    	}
    }

   
    void print() {
        System.out.print(sb);
    }
}
