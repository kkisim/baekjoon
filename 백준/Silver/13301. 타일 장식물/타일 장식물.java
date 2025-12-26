import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br;
    StringBuilder sb;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine().trim());

        long[] f = new long[N + 2]; 
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= N + 1; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        long ans = 2L * (f[N] + f[N + 1]);
        sb.append(ans);
    }

    void print() {
        System.out.print(sb.toString());
    }
}
