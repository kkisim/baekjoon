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
        String[] line1 = br.readLine().split(" ");
        int W = Integer.parseInt(line1[0]);
        int H = Integer.parseInt(line1[1]);

        String[] line2 = br.readLine().split(" ");
        int p = Integer.parseInt(line2[0]);
        int q = Integer.parseInt(line2[1]);

        int t = Integer.parseInt(br.readLine());

        // x축 계산: (p + t) 를 2*W 주기로 보고, 
        // 주기를 넘어가면 좌↔우 대칭으로 꺾이므로 'folding' 처리
        int modX = (p + t) % (2 * W);
        int x = (modX <= W) ? modX : 2 * W - modX;

        // y축 계산: (q + t) 를 2*H 주기로 보고, 
        // 주기를 넘어가면 상↔하 대칭으로 꺾이므로 'folding' 처리
        int modY = (q + t) % (2 * H);
        int y = (modY <= H) ? modY : 2 * H - modY;

        sb.append(x).append(" ").append(y);
    }

    void print() {
        System.out.print(sb);
    }
}
