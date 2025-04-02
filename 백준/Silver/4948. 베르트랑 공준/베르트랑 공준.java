
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
    boolean[] isPrime = new boolean[2_000_001];

    void setting() throws IOException {
        // 에라토스테네스의 체
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= 2_000_000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 2_000_000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while (true) {
            String line = br.readLine();
            if (line == null || line.equals("0")) break;

            int n = Integer.parseInt(line);
            int count = 0;

            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) count++;
            }

            sb.append(count).append('\n');
        }
    }

    void print() {
        System.out.print(sb);
    }
}
