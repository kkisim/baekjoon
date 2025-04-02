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
    boolean[] isPrime = new boolean[1000001];

    void setting() throws IOException {
        // 소수 판별 배열 초기화 (에라토스테네스의 체)
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            for (int j = 2; j <= n / 2; j++) {
                if (isPrime[j] && isPrime[n - j]) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }
    }

    void print() {
        System.out.print(sb);
    }
}
