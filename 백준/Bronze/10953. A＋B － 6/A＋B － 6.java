
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
        for(int i = 0 ; i < num ; i ++) {
        	String s [] = br.readLine().split(",");
        	int n1 = Integer.parseInt(s[0]);
        	int n2 = Integer.parseInt(s[1]);
        	int result = n1 + n2 ;
        	sb.append(result).append("\n");
        }
    }
    

    void print() {
        System.out.println(sb);
    }
}
