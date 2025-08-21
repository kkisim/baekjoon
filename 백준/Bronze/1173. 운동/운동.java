import java.io.*;

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
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int M = Integer.parseInt(s[2]);
        int T = Integer.parseInt(s[3]);
        int R = Integer.parseInt(s[4]);

        // 한 번도 운동을 시작할 수 없는 경우
        if (m + T > M) {
            sb.append(-1);
            return;
        }

        int pulse = m;   // 현재 맥박
        int time = 0;    // 지난 시간(분)
        int done = 0;    // 운동한 분 수

        while (done < N) {
            if (pulse + T <= M) {
                // 운동
                pulse += T;
                done++;
            } else {
                // 휴식
                pulse = Math.max(m, pulse - R);
            }
            time++;
        }

        sb.append(time);
    }

    void print() {
        System.out.println(sb.toString());
    }
}
