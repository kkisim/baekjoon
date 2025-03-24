
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       Set s = new Set();
       s.print();
       

}
}
class Set {
   static Scanner s = new Scanner(System.in);
   int num = s.nextInt();
   int hong = 1946;
   void print() {
	   System.out.println(num - hong);
   }
   
}
