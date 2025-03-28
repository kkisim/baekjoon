

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
    	 long n = Long.parseLong(br.readLine());
         long result = 4 * n;
    	sb.append(result);
    }
    void print() {
        System.out.print(sb);
    }
}
