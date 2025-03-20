
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        SolvedAC s = new SolvedAC();
        s.input();
        s.trimAndAverage();
        s.print();
    }
}

class SolvedAC {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    List<Integer> list = new ArrayList<>();
    int n;

    void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
    }

    void trimAndAverage() {
        if (n == 0) {
            sb.append(0);
            return;
        }

        Collections.sort(list);

        int cut = (int) Math.round(n * 0.15);
        int sum = 0;

        for (int i = cut; i < n - cut; i++) {
            sum += list.get(i);
        }

        int count = n - 2 * cut;
        int avg = (int) Math.round(sum / (double) count);
        sb.append(avg);
    }

    void print() {
        System.out.println(sb);
    }
}
