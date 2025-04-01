

import java.io.*;
import java.util.*;

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
    HashSet<String> numbers = new HashSet<>();

    void setting() throws IOException {
        int num = Integer.parseInt(br.readLine());
        while (num-- > 0) {
            String[] s = br.readLine().split(" ");
            if (s[1].equals("enter")) {
                numbers.add(s[0]);
            } else {
                numbers.remove(s[0]);
            }
        }

        
        List<String> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList, Collections.reverseOrder());

        for (String name : sortedList) {
            sb.append(name).append('\n');
        }
    }

    void print() {
        System.out.print(sb); 
    }
}
