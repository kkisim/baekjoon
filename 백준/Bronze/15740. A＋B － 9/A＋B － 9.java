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
        BigInteger A = new BigInteger(s[0]);
        BigInteger B = new BigInteger(s[1]);

        BigInteger result = A.add(B);
        sb.append(result);
    }

    void print() {
        System.out.println(sb);
    }
}
