import java.io.*;
import java.math.BigInteger;

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
        BigInteger num = new BigInteger(s[0]);
        BigInteger na = new BigInteger(s[1]);

        BigInteger result1 = num.divide(na);
        BigInteger result2 = num.remainder(na);

        sb.append(result1).append('\n');
        sb.append(result2).append('\n');
    }

    void print() {
        System.out.print(sb);
    }
}
