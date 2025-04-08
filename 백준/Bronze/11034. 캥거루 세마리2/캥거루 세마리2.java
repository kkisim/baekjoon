
import java.io.*;
import java.util.Arrays;

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
        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(" ");
            int one = Integer.parseInt(s[0]);
            int two = Integer.parseInt(s[1]);
            int three = Integer.parseInt(s[2]);

            int left = two - one;
            int right = three - two;
            sb.append(Math.max(left, right) - 1).append('\n');
        }
    

    	
    }

    void print() {
        System.out.print(sb);
    }
}
