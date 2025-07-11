import java.io.*;
import java.math.BigInteger;

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
    int num = Integer.parseInt(br.readLine());
    
    int result =Integer.MAX_VALUE;
    for (int i = 0; i <= num / 5; i++) {
        int fiv = i;
        int remain = num - (i * 5);
        if (remain % 2 == 0) {
            int two = remain / 2;
            int count = fiv + two;
            if (count < result) {
                result = count;
            }
        }
    }
    if(num == 0 || result == Integer.MAX_VALUE) {
    	sb.append("-1");
    }else {
    	 sb.append(result);
    }
   
    
    
    }
    void print() {
        System.out.println(sb);
    }
}
