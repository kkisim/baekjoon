
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
        int N = Integer.parseInt(br.readLine());
        int scoreD = 0, scoreP = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("D")) {
                scoreD++;
            } else {
                scoreP++;
            }
           
            if (Math.abs(scoreD - scoreP) >= 2) {
                break;
            }
        }

        sb.append(scoreD).append(":").append(scoreP);
    }

    void print() {
        System.out.print(sb);
    }
}
