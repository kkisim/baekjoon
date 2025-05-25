
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
        int caseNum = 1;

        while (true) {
            String line = br.readLine();
            if (line.equals("0")) break;

            String[] s = line.split(" ");
            int N = Integer.parseInt(s[0]);

            
            sb.append("Case ").append(caseNum++).append(": Sorting... done!\n");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
