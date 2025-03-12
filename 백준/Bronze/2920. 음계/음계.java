
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = new int[8];
        
        for (int i = 0; i < 8; i++) {
            notes[i] = sc.nextInt();
        }

        String result;
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 7; i++) {
            if (notes[i] < notes[i + 1]) {
                isDescending = false;
            } else if (notes[i] > notes[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            result = "ascending";
        } else if (isDescending) {
            result = "descending";
        } else {
            result = "mixed";
        }

        System.out.println(result);
    }
}
