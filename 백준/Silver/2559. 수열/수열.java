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
     int len = Integer.parseInt(s[0]);
     int k = Integer.parseInt(s[1]);
     
     int[] arr = new int[len];
     String[] temp = br.readLine().split(" ");
     for (int i = 0; i < len; i++) {
         arr[i] = Integer.parseInt(temp[i]);
     }
     int sum = 0;
     for(int i = 0; i <k;i++) {
    	 sum += arr[i];
     }
     int max= sum;
     
     for(int i = k ;i <len; i++) {
    	 sum += arr[i] - arr[i - k];
         max = Math.max(max, sum);
     }

     sb.append(max);
     
    }

   

    void print() {
        System.out.print(sb);
    }
}
