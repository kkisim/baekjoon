
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
        int num = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int target = Integer.parseInt(br.readLine());

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }

        Arrays.sort(arr); 

        int left = 0;
        int right = num - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        sb.append(count);
    }

    void print() {
        System.out.println(sb);
    }
}
