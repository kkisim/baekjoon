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
        int num = Integer.parseInt(br.readLine());
        String[] s = new String[num];
        for (int i = 0; i < num; i++) {
            s[i] = br.readLine();
        }

        int len = s[0].length();

        for (int i = 0; i < len; i++) {
            char c = s[0].charAt(i);
            boolean same = true;

            for (int j = 1; j < num; j++) {
                if (s[j].charAt(i) != c) {
                    same = false;
                    break;
                }
            }

            if (same) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
    }

    void print() {
        System.out.println(sb);
    }
}
