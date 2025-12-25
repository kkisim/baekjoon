import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        C c = new C();
        c.setting();
        c.print();
    }
}

class C {
    BufferedReader br;
    StringBuilder sb;
    String S;
    String[] suffix;

    void setting() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        S = br.readLine();
        int n = S.length();

        // 접미사 개수 = 문자열 길이
        suffix = new String[n];

        // 모든 접미사 생성
        for (int i = 0; i < n; i++) {
            suffix[i] = S.substring(i);
        }

        // 사전순 정렬
        Arrays.sort(suffix);

        // 출력 문자열 구성
        for (String s : suffix) {
            sb.append(s).append('\n');
        }
    }

    void print() {
        System.out.print(sb.toString());
    }
}
