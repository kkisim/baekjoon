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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            br.readLine(); 
        }

        sb.append("비와이");
    }

    void print() {
        System.out.print(sb);
    }
}
