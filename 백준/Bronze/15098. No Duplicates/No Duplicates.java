

import java.io.*;
import java.util.HashSet;

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
    String [] s;
    HashSet<String> Set = new HashSet<>();
 
    void setting () throws NumberFormatException, IOException {
    	s = br.readLine().split(" ");
    	boolean inword = false;
    	 for (String word : s) {
             if (!Set.add(word)) {
                 inword = true;
                 break;
             }
         }
    	 if(inword) {
    		 sb.append("no");
    	 }else {
    		 sb.append("yes");
    	 }
        }
    	
    

    void print() {
        System.out.print(sb);
    }
}
