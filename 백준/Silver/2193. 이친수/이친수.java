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
        int n = Integer.parseInt(br.readLine());
        if (n == 1) {
            sb.append(1);
            return;
        }

        long[][] pn = new long[n + 1][2];  
        pn[1][0] = 0;
        pn[1][1] = 1;

        for (int i = 2; i <= n; i++) {
            pn[i][0] = pn[i - 1][0] + pn[i - 1][1];
            pn[i][1] = pn[i - 1][0];
        }

        sb.append(pn[n][0] + pn[n][1]);
    }

    void print() {
        System.out.println(sb);
    }
}
