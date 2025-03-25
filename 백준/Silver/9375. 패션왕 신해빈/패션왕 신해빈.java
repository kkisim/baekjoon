
import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Fashion f = new Fashion();
        f.setting();  
        f.cal();      
    }
}

class Fashion {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int arnum;

    void setting() throws IOException {
        arnum = Integer.parseInt(br.readLine()); 

        for (int t = 0; t < arnum; t++) {
            int num = Integer.parseInt(br.readLine()); 
            HashMap<String, Integer> h = new HashMap<>();

            for (int i = 0; i < num; i++) {
                String[] s = br.readLine().split(" ");
                String type = s[1];
                h.put(type, h.getOrDefault(type, 0) + 1);
            }

            int result = 1;
            for (int count : h.values()) {
                result *= (count + 1); 
            }

            sb.append(result - 1).append('\n'); 
        }
    }

    void cal() {
        System.out.println(sb);
    }
}
