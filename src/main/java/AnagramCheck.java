import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string 1: ");
        String anagramStr1 = scanner.nextLine();
        System.out.print("Input string 2: ");
        String anagramStr2 = scanner.nextLine();

        if (anagramStr1.length() == anagramStr2.length()) {
            char[] anagramArr1 = anagramStr1.toCharArray();
            char[] anagramArr2 = anagramStr2.toCharArray();

            int iteration = anagramArr1.length - 1;
            for (int i = 0; i < anagramArr1.length - 1; i++) {
                for (int j = 0; j < iteration; j++) {
                    if (anagramArr1[i] > anagramArr1[i + 1]) {
                        char tmp;
                        tmp = anagramArr1[i];
                        anagramArr1[i] = anagramArr1[i + 1];
                        anagramArr1[i + 1] = tmp;
                    }
                    if (anagramArr2[i] > anagramArr2[i + 1]) {
                        char tmp;
                        tmp = anagramArr2[i];
                        anagramArr2[i] = anagramArr2[i + 1];
                        anagramArr2[i + 1] = tmp;
                    }
                }
                iteration--;
            }
            boolean isAnagram = true;
            for (int i = 0; i < anagramArr1.length; i++) {
                if(anagramArr1[i] != anagramArr2[i]){
                    isAnagram = false;
                    break;
                }
            }
            System.out.println("Is anagram " + isAnagram);
        } else
            System.out.println("Not anagram");
    }
}
