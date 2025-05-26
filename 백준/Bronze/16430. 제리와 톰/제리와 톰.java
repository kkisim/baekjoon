import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    void setting() throws IOException {
        String[] s = br.readLine().split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);

        int P = B - A;
        int Q = B;

        sb.append(P).append(" ").append(Q);
    }

    void print() {
        System.out.print(sb);
    }
}
