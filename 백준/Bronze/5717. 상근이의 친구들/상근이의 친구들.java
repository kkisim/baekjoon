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
        while (true) {
            String[] s = br.readLine().split(" ");
            int m = Integer.parseInt(s[0]);
            int f = Integer.parseInt(s[1]);

            if (m == 0 && f == 0) break;

            sb.append(m + f).append("\n");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
