
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
        
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int total = a + b;
        int overlap = Math.max(0, total - n);
        int oneCount = total - 2 * overlap;

        long result = 0;
        for (int i = 0; i < oneCount; i++) {
            result |= (1L << (n - 1 - i));
        }



        sb.append(result);
   
    }

    void print() {
        System.out.print(sb);
    }
}
