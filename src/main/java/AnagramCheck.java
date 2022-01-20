import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string 1: ");
        String anagramStr1 = scanner.nextLine();
        System.out.print("Input string 2: ");
        String anagramStr2 = scanner.nextLine();

        if (anagramCheck(anagramStr1, anagramStr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }

    static boolean anagramCheck(String s1, String s2) {

        s1 = s1.toLowerCase().replace(" ", "");
        s2 = s2.toLowerCase().replace(" ", "");

        // checking length
        if (s1.length() != s2.length()) {
            return false;
        }
        // transform to arrays
        char[] string1ToArray = s1.toCharArray();
        char[] string2ToArray = s2.toCharArray();

        // Sorting
        Arrays.sort(string1ToArray);
        Arrays.sort(string2ToArray);

        for (int i = 0; i < s1.length(); i++) {
            if (string1ToArray[i] != string2ToArray[i]) {
                return false;
            }
        }
        return true;
    }
}
