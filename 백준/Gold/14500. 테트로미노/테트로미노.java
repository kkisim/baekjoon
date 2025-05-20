

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
    int n , m = 0;
    int map [][];
    boolean visited[][] ; //dfs
    int max = 0;

    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    void setting() throws IOException {
    	String s [] = br.readLine().split(" ");
    	n = Integer.parseInt(s[0]);
        m = Integer.parseInt(s[1]);
        

        map = new int[n][m];
        visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(s[j]);
            }
        } for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(i, j, map[i][j], 1);
                visited[i][j] = false;
                checkExtraShape(i, j); // ㅗ 모양
            }
        }

        sb.append(max);
    }

    void dfs(int x, int y, int sum, int count) {
        if (count == 4) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if (visited[nx][ny]) continue;

            visited[nx][ny] = true;
            dfs(nx, ny, sum + map[nx][ny], count + 1);
            visited[nx][ny] = false;
        }
    }

    void checkExtraShape(int x, int y) {
        // ㅗ, ㅜ, ㅓ, ㅏ 모양
        int[][] dir = {
            {0, 1, 0, -1}, // + 중심
            {0, -1, -1, 1}, // ㅗ
            {-1, 0, 1, 0},
            {1, 0, -1, 0}
        };

        for (int i = 0; i < 4; i++) {
            int temp = map[x][y];
            boolean isValid = true;
            for (int j = 0; j < 3; j++) {
                int nx = x + dx[(i + j) % 4];
                int ny = y + dy[(i + j) % 4];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    isValid = false;
                    break;
                }
                temp += map[nx][ny];
            }
            if (isValid) max = Math.max(max, temp);
        }
    }

     
   
    	
    	
     
    

   

    void print() {
        System.out.print(sb);
    }
}
