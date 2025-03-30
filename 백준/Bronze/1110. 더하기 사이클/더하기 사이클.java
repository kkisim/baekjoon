

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
    	 int n = Integer.parseInt(br.readLine());
         int origin = n;
         int count = 0;
         do {
             int left = n / 10;
             int right = n % 10;
             int sum = left + right;
             n = right * 10 + (sum % 10);
             count++;
         } while (n != origin);
         sb.append(count);
    }

    void print() {
       System.out.println(sb);
    }
}
