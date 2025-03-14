
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.setting();
        s.sorting();
        s.print();
    }
}

class Sort {
    static Scanner sc = new Scanner(System.in);

    int num;
    String[] arr;
    List<String> list;

    void setting() {
        num = sc.nextInt();
        arr = new String[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.next();
        }

        Set<String> set = new HashSet<>(Arrays.asList(arr));
        list = new ArrayList<>(set);
    }

    void sorting() {
        // 길이 순 → 사전 순 정렬
        list.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));
    }

    void print() {
        for (String s : list) {
            System.out.println(s);
        }
    }
}
