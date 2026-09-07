
package trinhquanghuy_9694.baitapvenha;

public class Baitap3 {
    public static void main(String[] args) {

        String first = "Duy Tan";
        String second = " University";

        System.out.println("Using +: " + first + second);

        String result = first.concat(second);
        System.out.println("Using concat: " + result);

        // String không thay đổi sau khi concat
        System.out.println("first after concat without reassignment: " + first);
    }
}
