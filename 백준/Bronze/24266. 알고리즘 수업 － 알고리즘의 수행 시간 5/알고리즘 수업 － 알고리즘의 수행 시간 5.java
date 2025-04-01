

import java.io.*;

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

        long count = n * n * n; 
        sb.append(count).append("\n");
        sb.append(3).append("\n"); 
    }

    void print() {
        System.out.print(sb);
    }
}
