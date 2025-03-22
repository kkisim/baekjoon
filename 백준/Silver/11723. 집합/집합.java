
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Set se = new Set();
        se.setting();
        se.cal();
        se.print();
    }
}

class Set {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    boolean[] numbers = new boolean[21]; 

    int num;

    void setting() throws IOException {
        num = Integer.parseInt(br.readLine());
    }

    void cal() throws IOException {
        for (int i = 0; i < num; i++) {
            String[] s = br.readLine().split(" ");
            String co = s[0];
            int su = 0;

            if (!co.equals("all") && !co.equals("empty")) {
                su = Integer.parseInt(s[1]);
            }

            if (co.equals("add")) {
                numbers[su] = true;
            } else if (co.equals("remove")) {
                numbers[su] = false;
            } else if (co.equals("check")) {
                sb.append(numbers[su] ? "1\n" : "0\n");
            } else if (co.equals("toggle")) {
                numbers[su] = !numbers[su];
            } else if (co.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    numbers[j] = true;
                }
            } else if (co.equals("empty")) {
                for (int j = 1; j <= 20; j++) {
                    numbers[j] = false;
                }
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
