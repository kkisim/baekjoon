import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void setting() throws Exception {
        int T = Integer.parseInt(br.readLine().trim());

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine().trim());

            String maxSchool = "";
            int maxL = -1;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String school = st.nextToken();   
                int L = Integer.parseInt(st.nextToken());

                if (L > maxL) {
                    maxL = L;
                    maxSchool = school;
                }
            }
            sb.append(maxSchool).append('\n');
        }
    }

    void print() {
        System.out.print(sb.toString());
    }
}
