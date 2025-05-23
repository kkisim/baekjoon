import java.io.*;
import java.util.*;

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
        int[] weights = new int[3];
        for (int i = 0; i < 3; i++) {
            weights[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(weights); 
        sb.append(weights[1]); 
    }

    void print() {
        System.out.print(sb);
    }
}
