
import java.io.*;
import java.util.Arrays;

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
        int w[] = new int [10];
        for(int i = 0; i < 10; i++) {
        	w[i] = Integer.parseInt(br.readLine());
        }
        int k [] = new int [10];
        for(int i = 0; i <10; i++) {
        	k[i] = Integer.parseInt(br.readLine()); 
        }
        Arrays.sort(w);
        for (int l = 0, r = w.length - 1; l < r; l++, r--) {
            int t = w[l]; w[l] = w[r]; w[r] = t;
        }
        Arrays.sort(k);
        for (int l = 0, r = k.length - 1; l < r; l++, r--) { 
            int t = k[l]; k[l] = k[r]; k[r] = t;
        }
        int sum1 , sum2= 0;
        sum1 = w[0]+w[1]+w[2];
        sum2 = k[0]+k[1]+k[2];
        
        sb.append(sum1).append(" ").append(sum2);
    }

    void print() {
        System.out.println(sb.toString());
    }
}
