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
        int n = Integer.parseInt(br.readLine());
        int totalRounds = n + 1;

        int minTasks = totalRounds * 2;
        int maxTasks = totalRounds * 3;

        sb.append(minTasks).append(" ").append(maxTasks);
    }

    void print() {
        System.out.print(sb);
    }
}
