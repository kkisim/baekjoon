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
        String s [] = br.readLine().split(" ");
        int y = Integer.parseInt(s[0]);
        int x = Integer.parseInt(s[1]);
        int inven = Integer.parseInt(s[2]);
        
        int range[][]  = new int [y][x];
        int min = 256;
        int max = 0;
        
        for(int i = 0; i <y; i++) {
        	String input [] = br.readLine().split(" ");
        	for(int j = 0; j<x;j++) {
        		range[i][j]=Integer.parseInt(input[j]);
        		  min = Math.min(min, range[i][j]);
                  max = Math.max(max, range[i][j]);
        	}
        }
        
        int resultTime = Integer.MAX_VALUE;
        int resultHeight = -1;
        for (int h = min; h <= max; h++) {
            int remove = 0;
            int place = 0;

            for (int i = 0; i < y; i++) {
                for (int j = 0; j < x; j++) {
                    int diff = range[i][j] - h;
                    if (diff > 0) remove += diff;
                    else if (diff < 0) place -= diff;
                }
            }

            int inventory = inven + remove;
            if (inventory < place) continue;

            int time = (remove * 2) + place;
            if (time < resultTime || (time == resultTime && h > resultHeight)) {
                resultTime = time;
                resultHeight = h;
            }
        }
        sb.append(resultTime).append(" ").append(resultHeight);
    }

    void print() {
        System.out.print(sb);
    }
}
