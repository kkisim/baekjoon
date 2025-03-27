

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
        int T = Integer.parseInt(br.readLine());

        if (T % 10 != 0) {
            sb.append("-1\n");
            return;
        }

        int a = T / 300;
        T %= 300;

        int b = T / 60;
        T %= 60;

        int c = T / 10;

        sb.append(a).append(" ").append(b).append(" ").append(c).append('\n');
    }

    void print() {
        System.out.print(sb);
    }
}
