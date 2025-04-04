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
        String[] s = br.readLine().split(" ");
        
        Queue<Integer> line = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            line.add(Integer.parseInt(s[i]));
        }
        
        int num = 1;
        while (!line.isEmpty()) {
            if (line.peek() == num) {
                line.poll();
                num++;
            } else if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop();
                num++;
            } else {
                stack.push(line.poll());
            }
        }
        
        while (!stack.isEmpty()) {
            if (stack.peek() == num) {
                stack.pop();
                num++;
            } else {
                sb.append("Sad");
                return;
            }
        }

        sb.append("Nice");
    }

    void print() {
        System.out.print(sb);
    }
}
