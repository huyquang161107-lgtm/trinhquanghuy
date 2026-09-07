
package trinhquanghuy_9694.baitapvenha;
import java.util.*;
public class Baitap10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to censor: ");
        String word = sc.nextLine();

        String stars = "";

        for (int i = 0; i < word.length(); i++) {
            stars += "*";
        }

        String result = sentence.replace(word, stars);

        System.out.println("Censored: " + result);
    }
}
