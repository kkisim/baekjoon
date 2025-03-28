

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
        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            String[] input = br.readLine().split(" ");
            x[i] = Integer.parseInt(input[0]);
            y[i] = Integer.parseInt(input[1]);
        }

        int x4 = findUnique(x[0], x[1], x[2]);
        int y4 = findUnique(y[0], y[1], y[2]);

        sb.append(x4).append(" ").append(y4).append("\n");
    }

    int findUnique(int a, int b, int c) {
        if (a == b) return c;
        else if (a == c) return b;
        else return a;
    }

    void print() {
        System.out.print(sb);
    }
}
