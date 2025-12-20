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

        // 전체 줄: 2*N - 1
        for (int i = 1; i <= 2 * N - 1; i++) {

            int space, star;

            if (i <= N) {
                space = N - i;
                star = i;
            } else {
                space = i - N;
                star = 2 * N - i;
            }

            // 공백
            for (int j = 0; j < space; j++) {
                sb.append(" ");
            }
            // 별
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
