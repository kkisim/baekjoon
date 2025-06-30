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

    void setting() throws IOException {
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int idx = 0;
        for (int i = 1; i < n; i++) {
            long cube = 1L * i * i * i; 
            idx = (int)((idx + cube - 1) % list.size()); 
            list.remove(idx); 
        }

        sb.append(list.get(0)); 
    }

    void print() {
        System.out.println(sb);
    }
}
