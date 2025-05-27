
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
    	int num1 = Integer.parseInt(s[0])*56;
    	int num2 = Integer.parseInt(s[1])*24;
    	int num3 = Integer.parseInt(s[2])*14;
    	int num4 = Integer.parseInt(s[3])*6;
    	int sum = num1+num2+num3+num4;
    	
    	sb.append(sum);
    }

   
    void print() {
        System.out.print(sb);
    }
}
