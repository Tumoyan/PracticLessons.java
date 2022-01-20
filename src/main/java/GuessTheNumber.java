import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int rand = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number :) ");

        int tryCount = 0;
        int[][] saveNum;
        while (true) {
            System.out.println("Enter a num for 0 to 100 : ");
            int inputNum = scanner.nextInt();
            tryCount++;
            if (inputNum == rand) {
                System.out.println("You win!!! It took you " + tryCount + "tries");
                break;
            } else if (inputNum < rand) {
                System.out.println("Please enter more than " + inputNum);
            } else {
                System.out.println("Please enter less than " + inputNum);
            }
        }
        scanner.close();
    }
}
