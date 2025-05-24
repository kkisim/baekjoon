import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        new C().run();
    }
}

class C {
    final int MOD = 20000303;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    void run() throws IOException {
        String s = br.readLine();
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result = (int)(((long)result * 10 + (s.charAt(i) - '0')) % MOD);
        }

        sb.append(result);
        System.out.print(sb);
    }
}
