
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
        long s = Long.parseLong(br.readLine()); 

        long sum = 0;
        int count = 0;
        int i = 1;

        while (sum + i <= s) {
            sum += i;
            count++;
            i++;
        }

        sb.append(count);
    }

    void print() {
        System.out.print(sb);
    }
}
