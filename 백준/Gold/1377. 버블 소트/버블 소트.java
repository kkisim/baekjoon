import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C w = new C();
        w.setting();
        w.print();
    }
}

class C {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    static class P {
        int val;  
        int idx;   
        P(int v, int i) { val = v; idx = i; }
    }

    void setting() throws Exception {
        int N = Integer.parseInt(br.readLine());
        P[] arr = new P[N];
        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(br.readLine());
            arr[i] = new P(v, i);
        }

      
        Arrays.sort(arr, (a, b) -> {
            if (a.val != b.val) return a.val - b.val;
            return a.idx - b.idx;
        });

        int maxShift = 0;
        for (int i = 0; i < N; i++) {

            int shift = arr[i].idx - i;  
            if (shift > maxShift) maxShift = shift;
        }

        sb.append(maxShift + 1); 
    }

    void print() {
        System.out.println(sb.toString());
    }
}
