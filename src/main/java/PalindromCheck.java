import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write palindrome or not palindrome text");
        System.out.println("For example - civic,level,radar");
        String original = scanner.nextLine();
        original = original.replace(" ", "");
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
            System.out.println(reverse);
        }
        boolean palindrom = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.equals(reverse)) {
                System.out.println("Palindrome");
                break;
            } else {
                System.out.println("Not palindrom");
                break;
            }
        }
    }
}