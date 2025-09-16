import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws Exception {
    	int num = Integer.parseInt(br.readLine());
    	for(int i = 0; i <num; i++) {
    		String []s = br.readLine().split(" ");
    		int kk = Integer.parseInt(s[0]);
    		int mo = Integer.parseInt(s[1]);
    		cal(kk,mo);
    	}
       
    }
    void cal (int kk, int mo) {
    	int re = mo-kk+2;
    	sb.append(re).append("\n");
    }
    

    void print() {
        System.out.println(sb.toString());
    }
}
