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
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);

        // 첫 번째 형식: a ? b = c
        if (a + b == c) {
            sb.append(a).append("+").append(b).append("=").append(c);
        } else if (a - b == c) {
            sb.append(a).append("-").append(b).append("=").append(c);
        } else if (a * b == c) {
            sb.append(a).append("*").append(b).append("=").append(c);
        } else if (b != 0 && a / b == c) {
            sb.append(a).append("/").append(b).append("=").append(c);
        }
        // 두 번째 형식: a = b ? c
        else if (b + c == a) {
            sb.append(a).append("=").append(b).append("+").append(c);
        } else if (b - c == a) {
            sb.append(a).append("=").append(b).append("-").append(c);
        } else if (b * c == a) {
            sb.append(a).append("=").append(b).append("*").append(c);
        } else if (c != 0 && b / c == a) {
            sb.append(a).append("=").append(b).append("/").append(c);
        }
    }

    void print() {
        System.out.println(sb);
    }
}
