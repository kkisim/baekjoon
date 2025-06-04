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
       int num = Integer.parseInt(br.readLine());
       
       String s [] = br.readLine().split(" ");
       
       int[] arr = new int[num];
       for(int i = 0; i<num; i++) {
    	   arr[i] = Integer.parseInt(s[i]);
       }
       int result = arr[0];
       int sum = arr[0];
       for(int i =1; i<num;i++) {
    	   sum = Math.max(arr[i], sum + arr[i]);
    	   result = Math.max(result,sum );
       }
       sb.append(result);
       
    }

    

    void print() {
        System.out.print(sb);
    }
}
