import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br;
    StringBuilder sb;
    int N;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 2 * N - 1; i++) {
            int star;

            if (i <= N) {
                star = i;
            } else {
                star = 2 * N - i;
            }

            for (int j = 0; j < star; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
