import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("new arr length: ");
        int number = scanner.nextInt();
        int[] arr2 = new int[number];

        for (int i = 0; i < arr2.length; i += 3) {
            arr2[i] = (int) (50 * Math.random());
        }

        System.out.print("arr2 3rd elements are: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
        }

        for (int i = 0; i < arr2.length - 1; i += 2) {
            if (arr2[i + 1] != 0) {
                arr2[i] = arr2[i + 1] * 2;
            } else {
                arr2[i] = (int) (50 * Math.random());
            }
        }
    }
}