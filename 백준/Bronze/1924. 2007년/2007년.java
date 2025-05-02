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
        String[] input = br.readLine().split(" ");
        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);

       
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

       
        String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        int totalDays = 0;

        
        for (int i = 0; i < month - 1; i++) {
            totalDays += monthDays[i];
        }

    
        totalDays += day;

       
        sb.append(week[totalDays % 7]);
    }

    void print() {
        System.out.print(sb);
    }
}
