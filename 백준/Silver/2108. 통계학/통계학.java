
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        new Statistics().solve();
    }
}

class Statistics {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int[] freq = new int[8001]; 

    void solve() throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum = 0;
        int min = 4001;
        int max = -4001;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            sum += num;
            freq[num + 4000]++; 
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        Arrays.sort(arr);

      
        sb.append(Math.round((double) sum / n)).append('\n');

        
        sb.append(arr[n / 2]).append('\n');

       
        int maxFreq = 0;
        for (int f : freq) maxFreq = Math.max(maxFreq, f);

        List<Integer> modeList = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                modeList.add(i - 4000);
            }
        }

        if (modeList.size() == 1) {
            sb.append(modeList.get(0)).append('\n');
        } else {
            Collections.sort(modeList);
            sb.append(modeList.get(1)).append('\n'); 
        }

       
        sb.append(max - min);

        System.out.println(sb);
    }
}
