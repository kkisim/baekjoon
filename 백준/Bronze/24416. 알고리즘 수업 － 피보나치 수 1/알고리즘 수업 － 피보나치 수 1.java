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
    int fnum = 0;
    int finum =0;
    void setting() throws IOException {
    	 int num = Integer.parseInt(br.readLine());
    	 fib(num);
    	 fibonacci(num);
    	 
    	 sb.append(fnum).append(" ").append(finum);
 
    	 
    	 
    }
    int fib(int n) {
        if (n == 1 || n == 2) {
        	fnum++;
          return 1;}
        else return (fib(n-1) + fib(n-2));
    }
    int fibonacci(int n) {
    	if (n == 1 || n == 2) {
            return 1;}
    	int f [] = new int [n+1];
    	 f[1] = f[2] =1;
    	 for (int i = 3; i <= n; i++) {
             f[i] = f[i - 1] + f[i - 2];
             finum++;
         }
    	 return f[n];
    	
    }

    void print() {
        System.out.println(sb);
    }
}