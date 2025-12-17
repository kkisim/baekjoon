
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

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        String s = br.readLine();

        if (s.equals("SONGDO")) {
            sb.append("HIGHSCHOOL");
        } else if (s.equals("CODE")) {
            sb.append("MASTER");
        } else if (s.equals("2023")) {
            sb.append("0611");
        } else if (s.equals("ALGORITHM")) {
            sb.append("CONTEST");
        }
    }

    void print() {
        System.out.print(sb);
    }
}
