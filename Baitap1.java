
package trinhquanghuy_9694.baitapvenha;

import java.util.*;
public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String str = sc.nextLine();

        System.out.println("Original: [ " + str + " ]");
        System.out.println("Trimmed: [" + str.trim() + "]");
        System.out.println("Upper:   " + str.toUpperCase());
        System.out.println("Lower:   " + str.toLowerCase());
        System.out.println("Original length = " + str.length());
        System.out.println("Length after trim = " + str.trim().length());
    }
}
