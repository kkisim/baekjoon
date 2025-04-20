import java.io.*;
import java.util.*;

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
        int k = Integer.parseInt(br.readLine());
        String[] ss = br.readLine().split(" ");
        int[] d = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = Integer.parseInt(ss[i]);
        }
        Arrays.sort(d);

        int result = d[0] * d[k - 1];
        sb.append(result);
    }

    void print() {
        System.out.print(sb);
    }
}
