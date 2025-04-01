
import java.io.*;
import java.util.Arrays;

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
        int[] in = new int[num];

        for (int i = 0; i < num; i++) {
            in[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(in);

        int gcd = in[1] - in[0];
        for (int i = 2; i < num; i++) {
            gcd = GCD(gcd, in[i] - in[i - 1]);
        }

        int totalTreesNeeded = (in[num - 1] - in[0]) / gcd + 1;
        int toPlant = totalTreesNeeded - num;

        sb.append(toPlant);
    }

    int GCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    void print() {
        System.out.println(sb);
    }
}
