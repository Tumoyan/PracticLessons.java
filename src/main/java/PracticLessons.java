import java.util.Scanner;

public class PracticLessons {
    public static void main(String[] args) {

        System.out.println("Enter x type: ");
        Scanner scanner = new Scanner(System.in);
        //int x = scanner.nextInt();
        String txt = scanner.nextLine();
        switch (txt) {
            case "Hi":
                System.out.println("Case Hi");
            case "Good":
                System.out.println("Case Good");
            default:
                System.out.println("This is default case");
        }
    }
}
