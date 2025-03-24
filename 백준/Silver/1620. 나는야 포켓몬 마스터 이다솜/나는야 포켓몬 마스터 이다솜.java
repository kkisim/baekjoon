
import java.io.*;
import java.util.*;

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
    int dicnum;
    int num;
    String[] s;
    HashMap<String, Integer> map = new HashMap<>();

    void setting() throws IOException {
        String[] first = br.readLine().split(" ");
        dicnum = Integer.parseInt(first[0]);
        num = Integer.parseInt(first[1]);
        s = new String[dicnum];

        for (int i = 0; i < dicnum; i++) {
            s[i] = br.readLine();
            map.put(s[i], i + 1); 
        }
    }

    void cal() throws IOException {
        for (int i = 0; i < num; i++) {
            String input = br.readLine();

            if (input.matches("\\d+")) {
                int number = Integer.parseInt(input) - 1;
                sb.append(s[number]).append('\n');
            } else {
                sb.append(map.get(input)).append('\n');
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
