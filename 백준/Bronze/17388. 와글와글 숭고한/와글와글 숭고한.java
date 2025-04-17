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
        String[] s = br.readLine().split(" ");
        int S = Integer.parseInt(s[0]);
        int K = Integer.parseInt(s[1]);
        int H = Integer.parseInt(s[2]);

        int sum = S + K + H;
        if (sum >= 100) {
            sb.append("OK");
        } else {
            int min = Math.min(S, Math.min(K, H));
            if (min == S) {
                sb.append("Soongsil");
            } else if (min == K) {
                sb.append("Korea");
            } else {
                sb.append("Hanyang");
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
