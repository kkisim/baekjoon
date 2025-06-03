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

    long A, B, C;

    void setting() throws IOException {
        String[] input = br.readLine().split(" ");
        A = Long.parseLong(input[0]);
        B = Long.parseLong(input[1]);
        C = Long.parseLong(input[2]);

        sb.append(pow(A, B)).append("\n");
    }

    long pow(long a, long b) {
        if (b == 1) return a % C;

        long half = pow(a, b / 2);
        long result = (half * half) % C;

        if (b % 2 == 1) {
            result = (result * a) % C;
        }
        return result;
    }

    void print() {
        System.out.print(sb);
    }
}
