
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        so s = new so();
        s.setting();
        s.print();
    }
}

class Document {
    int index;
    int priority;
    Document(int index, int priority) {
        this.index = index;
        this.priority = priority;
    }
}

class so {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num;

    void setting() throws IOException {
        num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            doc();
        }
    }

    void doc() throws IOException {
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        Queue<Document> q = new LinkedList<>();
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            q.offer(new Document(i, Integer.parseInt(input[i])));
        }

        int count = 0;
        while (!q.isEmpty()) {
            Document current = q.poll();

            boolean hasHigher = false;
            for (Document d : q) {
                if (d.priority > current.priority) {
                    hasHigher = true;
                    break;
                }
            }

            if (hasHigher) {
                q.offer(current);
            } else {
                count++;
                if (current.index == m) {
                    sb.append(count).append('\n');
                    return;
                }
            }
        }
    }

    void print() {
        System.out.print(sb);
    }
}