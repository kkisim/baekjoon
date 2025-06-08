import java.io.*;

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
        String[] lp = br.readLine().split(" ");
        int l = Integer.parseInt(lp[0]);
        int p = Integer.parseInt(lp[1]);

        int actual = l * p;

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < 5; i++) {
            int reported = Integer.parseInt(input[i]);
            sb.append(reported - actual).append(" ");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
