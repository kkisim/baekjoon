
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	 new Search().input();
    }
}

class Search {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int num1;
    ArrayList<Integer> num2 = new ArrayList<Integer>();
    int num3;
    Map<Integer,Integer> countMap = new HashMap<>();

    void input() throws IOException {
        int num1 = Integer.parseInt(br.readLine());
        String[] r1 = br.readLine().split(" ");

        for (int i = 0; i < num1; i++) {
            int n = Integer.parseInt(r1[i]);
            countMap.put(n, countMap.getOrDefault(n, 0) + 1);
        }

        int num2 = Integer.parseInt(br.readLine());
        String[] r2 = br.readLine().split(" ");

        for (int i = 0; i < num2; i++) {
            int key = Integer.parseInt(r2[i]);
            sb.append(countMap.getOrDefault(key, 0)).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
    
}
