import java.io.*;
import java.util.StringTokenizer;

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
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        boolean isLunchTime = (12 <= T && T <= 16);
        boolean isWithAlcohol = (S == 1);

        if (isLunchTime && !isWithAlcohol) {
            sb.append(320);
        } else {
            sb.append(280);
        }
    }

    void print() {
        System.out.print(sb);
    }
}
