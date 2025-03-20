
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack s = new Stack();
        s.input();
    }
}

class Stack {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Deque<Integer> stack = new ArrayDeque<>();

    void input() throws IOException {
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String line = br.readLine();

            if (line.startsWith("push")) {
                int num = Integer.parseInt(line.split(" ")[1]);
                stack.push(num);
            } else if (line.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (line.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (line.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (line.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }

        System.out.print(sb);
    }
}
