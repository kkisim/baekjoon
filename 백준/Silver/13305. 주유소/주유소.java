

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
        long[] dist = new long[n - 1]; 
        long[] price = new long[n];    


        String[] d = br.readLine().split(" ");
        for (int i = 0; i < n - 1; i++) {
            dist[i] = Long.parseLong(d[i]);
        }


        String[] p = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            price[i] = Long.parseLong(p[i]);
        }

        long total = 0;
        long min = price[0]; 

        for (int i = 0; i < n - 1; i++) {
            if (price[i] < min) {
                min = price[i]; 
            }
            total += min * dist[i];
        }

        sb.append(total).append('\n');
    }

    void print() {
        System.out.print(sb);
    }
}
