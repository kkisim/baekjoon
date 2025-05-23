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
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split(" ");
            long x = Long.parseLong(s[0]);
            long y = Long.parseLong(s[1]);
            sb.append(x + y).append("\n");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
