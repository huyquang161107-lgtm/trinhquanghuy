
package trinhquanghuy_9694.baitapvenha;
import java.util.*;
public class Baitap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        String reversed = sb.reverse().toString();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
