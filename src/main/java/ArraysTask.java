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
        /*
            հաշվել և տերմինալում տպել թե քանի 0 կա 2րդ զանգվածում
            և գտնել թե որ զանգվածում ավելի շատ թիվ կա 0-ները չհաշված
         */
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
        int rand = (int) (Math.random() * 14);
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1)
                array[i] *= 2;
            else if (array[i] == 0) {
                array[i] = rand;
            }
            System.out.print(array[i] + " ");
        }
        // 9 task
        int count = 0;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == 0)
                count++;
        }
        System.out.println();
        System.out.print("Zero count in number two arrays: " + count);
        int countNum = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] != 0)
                countNum++;
        }
        System.out.println();
        System.out.print("Array contains more numbers : " + countNum);
    }
}