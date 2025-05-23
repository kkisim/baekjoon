import java.io.*;
import java.math.BigInteger;

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
        BigInteger total = new BigInteger(br.readLine()); // T
        BigInteger diff = new BigInteger(br.readLine());  // D

        BigInteger klaudia = (total.add(diff)).divide(BigInteger.valueOf(2));
        BigInteger natalia = total.subtract(klaudia);

        sb.append(klaudia).append("\n").append(natalia);
    }

    void print() {
        System.out.print(sb);
    }
}
