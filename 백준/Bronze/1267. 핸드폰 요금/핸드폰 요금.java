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
        String[] s = br.readLine().split(" ");
        int[] call = new int[n];
        int y = 0;  // 영식 요금제
        int m = 0;  // 민식 요금제

        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(s[i]);
            y += ((t / 30) + 1) * 10;
            m += ((t / 60) + 1) * 15;
        }

        if (y < m) {
            sb.append("Y ").append(y);
        } else if (m < y) {
            sb.append("M ").append(m);
        } else {
            sb.append("Y M ").append(y);
        }
    }

    void print() {
        System.out.println(sb);
    }
}
