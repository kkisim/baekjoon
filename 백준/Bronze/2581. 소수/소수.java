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
    int start;
    int end;
    int result = 0;
    int min = Integer.MAX_VALUE;

    void setting() throws IOException {
        start = Integer.parseInt(br.readLine());
        end = Integer.parseInt(br.readLine());

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                result += i;
                if (min == Integer.MAX_VALUE) {
                    min = i;
                }
            }
        }

        if (result == 0) {
            sb.append(-1).append('\n');
        } else {
            sb.append(result).append('\n');
            sb.append(min).append('\n');
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    void print() {
        System.out.print(sb);
    }
}
