import java.util.Scanner;

public class ArraysTask {
    public static void main(String[] args) {
        // 1-2 task
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * 100);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("Size array: " + array.length);

        //3,4,5,6 task
        int array[];
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size array:");
        n = scan.nextInt();
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 2) {
                array[i] = (int) (Math.random() * 14);
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        // 7,8 task
        for (int i = 0; i < array.length - 1; i += 2) {
            if (array[i + 1] != 0) {
                array[i] = array[i + 1] * 2;
            } else {
                    array[i] = (int) (Math.random() * 14);
            }

        }
        System.out.println("");
        System.out.print("array 2nd elements are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) count++;
        }
        System.out.println("");
        System.out.print("array has " + count + " elements");

        if (count > array.length) {
            System.out.println("second is bigger");
        } else if (count == array.length) {
            System.out.println("equal");
        } else {
            System.out.println("arr is bigger");
        }
    }
}