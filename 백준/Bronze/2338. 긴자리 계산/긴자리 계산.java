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
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        sb1.append(br.readLine());
        sb2.append(br.readLine());

        BigInteger a = new BigInteger(sb1.toString());
        BigInteger b = new BigInteger(sb2.toString());
        
        sb.append(a.add(b)).append('\n');
        sb.append(a.subtract(b)).append('\n');
        sb.append(a.multiply(b)).append('\n');

    }

    void print() {
        System.out.print(sb);
    }
}
