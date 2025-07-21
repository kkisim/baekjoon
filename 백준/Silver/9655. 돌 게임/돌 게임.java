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
      int  n = Integer.parseInt(br.readLine());
       if(n % 2 == 0) {
    	   sb.append("CY");
       }else {
    	   sb.append("SK");
       }
    }

    void print() {
        System.out.println(sb);
    }
}
