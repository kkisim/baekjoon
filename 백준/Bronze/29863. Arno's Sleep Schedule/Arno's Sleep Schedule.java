
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
       int start = Integer.parseInt(br.readLine());
       int end = Integer.parseInt(br.readLine());
       
       int time = end - start;
       
       if(time <=0) {
    	   time = time+24;
       }
       sb.append(time);
    }

    void print() {
        System.out.print(sb);
    }
}
