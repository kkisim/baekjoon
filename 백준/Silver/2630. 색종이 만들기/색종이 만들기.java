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
    int N;
    int[][] paper;
    int white = 0, blue = 0;

    void setting() throws IOException {
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, N);
        sb.append(white).append('\n').append(blue).append('\n');
    }

    
    void divide(int r, int c, int size) {
        if (allSame(r, c, size)) {
            if (paper[r][c] == 0) white++;
            else blue++;
            return;
        }
        int half = size / 2;
        divide(r,     c,     half); 
        divide(r,     c+half,half); 
        divide(r+half,c,     half); 
        divide(r+half,c+half,half); 
    }

   
    boolean allSame(int r, int c, int size) {
        int color = paper[r][c];
        for (int i = r; i < r + size; i++) {
            for (int j = c; j < c + size; j++) {
                if (paper[i][j] != color) return false;
            }
        }
        return true;
    }

    void print() {
        System.out.print(sb);
    }
}
