import java.util.Arrays;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.nextLine();

        System.out.print("Enter word2: ");
        String word2 = sc.nextLine();

        // Convert words to lowercase
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        // Convert strings to character arrays
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        // Sort the character arrays
        Arrays.sort(a);
        Arrays.sort(b);

        // Compare
        if (Arrays.equals(a, b)) {
            System.out.println("Word1 and Word2 are Anagrams");
        } else {
            System.out.println("Word1 and Word2 are NOT Anagrams");
        }

        sc.close();
    }
}
 
