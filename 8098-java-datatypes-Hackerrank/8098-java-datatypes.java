import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String []argh) {

        Scanner sc = new Scanner(System.in);
        // Check if there is an integer for the number of test cases
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                
                // Using constants is safer and more professional
                if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* short");
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println("* int");
                if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println("* long");
            }
            catch(Exception e) {
                // IMPORTANT: sc.next() consumes the invalid token so the loop can continue
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
