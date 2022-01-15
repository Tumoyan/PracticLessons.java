import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        PalindromCheck pn = new PalindromCheck();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write palindrome or not palindrome text");
        System.out.println("For example - civic,level,race car");
        String original = scanner.nextLine();
        original = original.replace(" ","" );
        String reverse = "";
        for (int i = original.length() - 1; i >=0; i--) {
            reverse += original.charAt(i);
            System.out.println(reverse);
        }
        boolean palindrom = true;
        for (int i = 0; i < original.length() ; i++) {
            if(original.charAt(i) != reverse.charAt(i)){
                palindrom = false;
            }
        }
        if (palindrom){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrom");
        }
    }
}
