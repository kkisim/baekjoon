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
     int num = 0;
     for(int i = 0; i <4; i++) {
    	 int n = Integer.parseInt(br.readLine());
    	 num = num+n;
     }
     num +=300;
     if(num <= 1800) {
    	 sb.append("Yes");
     }else {
    	 sb.append("No");
     }
     
    }

    void print() {
        System.out.println(sb);
    }
}
