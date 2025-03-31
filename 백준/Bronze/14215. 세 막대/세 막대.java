
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
    	String[] s = br.readLine().split(" ");
    	int [] num = new int [s.length];
    	for(int i =0; i < num.length; i++) {
    		num[i] = Integer.parseInt(s[i]);
    	}
    	Arrays.sort(num);
    	while(num[2] >= (num[1]+num[0])) {
    		num[2]--;
    	}
    	int result = num[0] + num[1] + num[2];
    	sb.append(result);
    }
    void print() {
        System.out.println(sb);
    }
}
