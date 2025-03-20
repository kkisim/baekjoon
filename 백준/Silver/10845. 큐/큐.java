
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        CustomQueue cq = new CustomQueue();
        cq.input();
        cq.print();
    }
}

class CustomQueue {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    Deque<Integer> q = new ArrayDeque<>();
    int num;

    void input() throws IOException {
        num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "push":
                    q.offer(Integer.parseInt(cmd[1]));
                    break;
                case "pop":
                    sb.append(q.isEmpty() ? -1 : q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    sb.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    sb.append(q.isEmpty() ? -1 : q.peek()).append("\n");
                    break;
                case "back":
                    sb.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
                    break;
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}
