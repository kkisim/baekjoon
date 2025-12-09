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

    void setting() throws Exception {

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int tc = 0; tc < T; tc++) {
            String line = br.readLine(); // 덩굴 구조 문자열 (빈 줄일 수도 있음)

            int depth = 0;      // 현재 깊이
            int maxDepth = 0;   // 최대 깊이

            if (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch == '[') {
                        depth++;
                        if (depth > maxDepth) maxDepth = depth;
                    } else if (ch == ']') {
                        depth--;
                    }
                }
            }

            long answer = 1L << maxDepth; // 2^maxDepth
            sb.append(answer).append('\n');
        }
    }

    void print() {
        System.out.print(sb.toString());
    }
}
