import java.io.*;
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
    	int num = Integer.parseInt(br.readLine());
    	int  n [] = new int[num];
    	for(int i = 0; i <num; i++) {
    		n[i] = Integer.parseInt(br.readLine());
    	}
    	 Arrays.sort(n);
    	int max = 0;
    	for(int i = 0; i <num; i++) {
    		 int weight = n[i] * (num - i); 
             if (weight > max) max = weight;
    	}
    	 sb.append(max);
    }

    void print() {
        System.out.print(sb);
    }
}
