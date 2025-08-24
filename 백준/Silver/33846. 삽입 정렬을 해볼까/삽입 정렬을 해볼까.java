import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws Exception {
        String[] f = br.readLine().trim().split(" ");
        int len = Integer.parseInt(f[0]);
        int stop = Integer.parseInt(f[1]);

        int[] num = new int[len];

        String[] tokens = br.readLine().trim().split(" ");
        int idx = 0;
        while (idx < len) {
            for (int i = 0; i < tokens.length && idx < len; i++) {
                num[idx++] = Integer.parseInt(tokens[i]);
            }
            if (idx < len) tokens = br.readLine().trim().split(" ");
        }

        int limit = Math.min(stop, len);
        
        Arrays.sort(num, 0, limit);

        for (int i = 0; i < len; i++) sb.append(num[i]).append(' ');
    }

    void print() {
        System.out.println(sb.toString());
    }
}
