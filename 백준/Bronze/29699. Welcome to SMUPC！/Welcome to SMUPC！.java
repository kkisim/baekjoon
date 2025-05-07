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
        int num = Integer.parseInt(br.readLine())%14;
        String s  = "WelcomeToSMUPC";
        
        if (num == 0) num = 14;
        sb.append(s.charAt(num-1));
        
        
        
       
    }

    void print() {
        System.out.println(sb);
    }
}