
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        long N = sc.nextLong(); 
        long[] sizes = new long[6];
        long totalTshirts = 0;

        for (int i = 0; i < 6; i++) {
            sizes[i] = sc.nextLong();
            totalTshirts += sizes[i];
        }

        long T = sc.nextLong();
        long P = sc.nextLong(); 


        long tshirtBundles = 0;
        for (int i = 0; i < 6; i++) {
            tshirtBundles += (sizes[i] + T - 1) / T; 
        }

        long penBundles = N / P;
        long penSingles = N % P;

  
        System.out.println(tshirtBundles);
        System.out.println(penBundles + " " + penSingles);
    }
}
