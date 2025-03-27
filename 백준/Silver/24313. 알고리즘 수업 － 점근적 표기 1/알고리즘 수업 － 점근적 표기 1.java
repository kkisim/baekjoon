

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
        String[] line1 = br.readLine().split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean valid = true;

      
        for (int n = n0; n <= 100; n++) { 
            long fn = (long)a * n + b;
            long cn = (long)c * n;
            if (fn > cn) {
                valid = false;
                break;
            }
        }

        sb.append(valid ? 1 : 0).append('\n');
    }

    void print() {
        System.out.print(sb);
    }
}
