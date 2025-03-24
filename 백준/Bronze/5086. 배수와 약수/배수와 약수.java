
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FactorMultiple f = new FactorMultiple();
        f.cal();
        f.print();
    }
}

class FactorMultiple {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void cal() throws IOException {
        while (true) {
            String[] input = br.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);

            if (A == 0 && B == 0) break;

            if (B % A == 0) {
                sb.append("factor").append('\n');
            } else if (A % B == 0) {
                sb.append("multiple").append('\n');
            } else {
                sb.append("neither").append('\n');
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
