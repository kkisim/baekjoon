
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
        int N = Integer.parseInt(br.readLine());

        int case1 = N - (N * 22 / 100);
        int case2 = N - ((N * 20 / 100) * 22 / 100);

        sb.append(case1).append(" ").append(case2);
    }

    void print() {
        System.out.println(sb);
    }
}
