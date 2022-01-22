import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int rand = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number :) ");
        System.out.println("Enter a num from 0 to 100");

        List<Integer> listOfNums = new ArrayList<>();

        int tryCount = 0;
        while (true) {
            int inputNum = scanner.nextInt();
            listOfNums.add(inputNum);
            tryCount++;

            if (tryCount == 20) {
                System.out.println("Your limit has been expired");
                break;
            }

            if (inputNum == rand) {
                System.out.println("You win!!! It took you " + tryCount + " tries");
                break;
            } else if (inputNum < rand) {
                System.out.println("Please enter more than " + inputNum);
            } else {
                System.out.println("Please enter less than " + inputNum);
            }
        }
        System.out.println("Your input numbers: " + listOfNums);
        scanner.close();
    }
}