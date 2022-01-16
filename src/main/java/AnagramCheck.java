import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings:");
        System.out.println("For example - evil and vile. Madam Curie and Radium came");
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        checkAnagram(str1, str2);
    }

    public static void checkAnagram(String s1, String s2) {
        String firstStr = s1.replace("\\s", "");
        String secondStr = s2.replace("\\s", "");

        boolean status = true;
        if (firstStr.length() != secondStr.length()) {
            status = false;
        } else {
            char[] firstStrArr = firstStr.toCharArray();
            char[] secondStrArr = secondStr.toCharArray();

            Arrays.sort(firstStrArr);
            Arrays.sort(secondStrArr);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagram");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT anagram");
        }
    }
}
