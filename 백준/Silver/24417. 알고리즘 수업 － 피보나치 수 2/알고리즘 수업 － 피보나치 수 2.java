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
    static final long MOD = 1_000_000_007L;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        long n = Long.parseLong(br.readLine().trim());

        long code1 = fib(n)[0] % MOD;          // F(n)
        long code2 = (n - 2) % MOD;            // n-2 (mod)
        if (code2 < 0) code2 += MOD;

        sb.append(code1).append(' ').append(code2);
    }

    // 반환: [F(n), F(n+1)] (mod MOD)
    long[] fib(long n) {
        if (n == 0) return new long[]{0, 1};

        long[] half = fib(n >> 1);
        long a = half[0]; // F(k)
        long b = half[1]; // F(k+1)

        // c = F(2k) = F(k) * (2*F(k+1) - F(k))
        long twoBMinusA = (2 * b % MOD - a + MOD) % MOD;
        long c = (a * twoBMinusA) % MOD;

        // d = F(2k+1) = F(k)^2 + F(k+1)^2
        long d = (a * a % MOD + b * b % MOD) % MOD;

        if ((n & 1) == 0) {
            return new long[]{c, d};
        } else {
            return new long[]{d, (c + d) % MOD};
        }
    }

    void print() {
        System.out.print(sb.toString());
    }
}
