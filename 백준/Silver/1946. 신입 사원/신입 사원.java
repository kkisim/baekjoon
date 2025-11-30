
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
    StringTokenizer st;

    void setting() throws Exception {
      

        int T = Integer.parseInt(br.readLine()); //케이스 개수
        

        for( int i =0; i<T; i++) {
        
	        int num = Integer.parseInt(br.readLine());
            int[][] arr = new int[num][2]; // [i][0] = 서류 순위, [i][1] = 면접 순위
	        
            for (int j = 0; j < num; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken()); // 서류
                arr[j][1] = Integer.parseInt(st.nextToken()); // 면접
            }
         // 서류 순위 기준 오름차순 정렬
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            // 첫 번째 사람은 무조건 뽑힘
            int count = 1;
            int bestInterview = arr[0][1]; // 지금까지 뽑힌 사람들 중 면접 순위 최소값

            // 나머지 사람들 확인
            for (int k = 1; k < num; k++) {
                // 면접 순위가 지금까지 최고 기록(bestInterview)보다 더 좋으면(숫자가 더 작으면)
                if (arr[k][1] < bestInterview) {
                    count++;
                    bestInterview = arr[k][1];
                }
            }

            sb.append(count).append('\n');
	    	  
	      }
	    	  
        }
    	
    

   

    void print() {
        System.out.print(sb.toString());
    }
}
