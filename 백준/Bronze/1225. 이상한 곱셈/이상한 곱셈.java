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
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];

        long sumA = 0;
        long sumB = 0;

        for (int i = 0; i < A.length(); i++) {
            sumA += A.charAt(i) - '0';
        }

        for (int i = 0; i < B.length(); i++) {
            sumB += B.charAt(i) - '0';
        }

        sb.append(sumA * sumB);
    }

    void print() {
        System.out.println(sb);
    }
}
