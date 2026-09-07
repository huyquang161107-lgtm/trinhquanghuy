
package trinhquanghuy_9694.baitapvenha;
import java.util.*;
public class Baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student ID, for example SE123456: ");
        String id = sc.nextLine();

        String majorCode = id.substring(0, 2);
        String numericPart = id.substring(2);

        System.out.println("Major code = " + majorCode);
        System.out.println("Numeric part = " + numericPart);
    }
}
