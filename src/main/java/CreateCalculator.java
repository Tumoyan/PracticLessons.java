import java.util.Scanner;

public class CreateCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.print("Enter what you want to calculate: ");
        String userInput = input.nextLine();
        String[] splitString = userInput.split(" ");

        switch (splitString[1].charAt(0)) {
            case '+':
                result = Integer.parseInt(splitString[0])
                        + Integer.parseInt(splitString[2]);
                break;
            case '-':
                result = Integer.parseInt(splitString[0])
                        - Integer.parseInt(splitString[2]);
                break;
            case '*':
                result = Integer.parseInt(splitString[0])
                        * Integer.parseInt(splitString[2]);
                break;
            case '/':
                result = Integer.parseInt(splitString[0])
                        / Integer.parseInt(splitString[2]);
            case '%':
                result = Integer.parseInt(splitString[0])
                        % Integer.parseInt(splitString[2]);
            default:
                System.out.println("Please enter correct symbol or num");
                break;
        }
        System.out.println(splitString[0] + ' ' + splitString[1] + ' '
                + splitString[2] + " = " + result);
    }
}
