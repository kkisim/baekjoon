import java.io.*;
import java.math.BigInteger;
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
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    

    void setting() throws IOException {
    	int num = Integer.parseInt(br.readLine());
    	bw.write(BigInteger.TWO.pow(num).subtract(BigInteger.ONE) + "\n");
    	if (num <= 20) {
            top(num, 1, 2, 3);
        }
    	bw.flush();
    	
    	
    }
    void top(int num, int a , int b, int c) throws IOException {
    	if(num == 1) {
    		bw.write(a + " " + c + "\n");
    		return;
    	}else {
    		top(num-1, a,c,b);
    		bw.write(a + " " + c + "\n");
        	top(num-1,b,a,c);
        	
        }
    	}
    	
   
    void print() {
        System.out.print(sb);
    }
}
