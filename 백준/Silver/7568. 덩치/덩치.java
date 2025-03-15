
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       Sort s = new Sort();
       s.read();
       s.cal();
       
        
    }
}

class Member {
    int weight;
    int height;

    Member(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }
}

class Sort {
    int num;
    List<Member> members;

    void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        members = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] input = br.readLine().split(" ");
            int weight = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);
            members.add(new Member(weight, height));
        }
    }
    void cal() {
    	for (int i = 0; i < num; i++) {
    	    int rank = 1;
    	    for (int j = 0; j < num; j++) {
    	        if (i == j) continue;
    	        if (members.get(i).weight < members.get(j).weight &&
    	            members.get(i).height < members.get(j).height) {
    	            rank++;
    	        }
    	    }
    	    System.out.print(rank + " ");
    	}

    }


}
