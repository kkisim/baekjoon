

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
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        int a = Integer.parseInt(s1[0]);
        int b = Integer.parseInt(s1[1]);
        int c = Integer.parseInt(s2[0]);
        int d = Integer.parseInt(s2[1]);

        int ja = a * d + c * b;
        int mo = b * d;

        int gcd = GCD(ja, mo);
        sb.append(ja / gcd).append(" ").append(mo / gcd);
    }

    int GCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    void print() {
        System.out.println(sb);
    }
}
