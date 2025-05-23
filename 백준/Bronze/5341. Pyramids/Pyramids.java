import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws IOException {
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int total = n * (n + 1) / 2;
            sb.append(total).append("\n");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
