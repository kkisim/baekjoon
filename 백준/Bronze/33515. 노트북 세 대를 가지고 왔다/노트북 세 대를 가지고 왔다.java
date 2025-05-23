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
        String[] s = br.readLine().split(" ");
        int t1 = Integer.parseInt(s[0]);
        int t2 = Integer.parseInt(s[1]);

        int maxTime = Math.min(t1, t2);  

        sb.append(maxTime);
    }

    void print() {
        System.out.print(sb);
    }
}
