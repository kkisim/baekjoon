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
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            long n = Long.parseLong(br.readLine());
            while (true) {
                if (isPrime(n)) {
                    sb.append(n).append('\n');
                    break;
                }
                n++;
            }
        }
    }

    public boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        return true;
    }

    void print() {
        System.out.print(sb);
    }
}
