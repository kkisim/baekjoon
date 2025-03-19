
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Chess s = new Chess();
    	s.read();
    	
    }
}

class Chess {
    int n, m;
    char[][] board;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void read() throws IOException {
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        board = new char[n][];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        cal();
    }

    void cal() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                min = Math.min(min, countRepaint(i, j));
            }
        }
        System.out.println(min);
    }

    int countRepaint(int x, int y) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char expectedW = ((i + j) % 2 == 0) ? 'W' : 'B';
                char expectedB = ((i + j) % 2 == 0) ? 'B' : 'W';

                if (board[x + i][y + j] != expectedW) count1++;
                if (board[x + i][y + j] != expectedB) count2++;
            }
        }
        return Math.min(count1, count2);
    }
}
