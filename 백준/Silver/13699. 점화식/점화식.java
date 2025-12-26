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
    int N;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        long[] t = new long[n + 1];
        t[0] = 1;

        for (int k = 1; k <= n; k++) {
            long sum = 0;
            for (int i = 0; i <= k - 1; i++) {
                sum += t[i] * t[k - 1 - i];
            }
            t[k] = sum;
        }

        sb.append(t[n]);
    
        
    }

    void print() {
        System.out.print(sb);
    }
}
