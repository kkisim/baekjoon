

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Eq eq = new Eq();
        eq.setting();
        eq.solve();
    }
}

class Eq {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int a, b, c, d, e, f;

    void setting() throws IOException {
        String[] input = br.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);
        d = Integer.parseInt(input[3]);
        e = Integer.parseInt(input[4]);
        f = Integer.parseInt(input[5]);
    }

    void solve() {
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    sb.append(x).append(" ").append(y);
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}
