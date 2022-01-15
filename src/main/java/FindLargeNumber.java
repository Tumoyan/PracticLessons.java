import java.util.Scanner;

public class FindLargeNumber {
    public static void main(String[] args) {
        int[] rand = {7, 20, 30, 75, 5};
        int maxNum = rand[0];
        /* 10 մեծ ա՞ 10 ից (false)
           i = 20 մեծ ա՞ 10 (maxNum) ից (true) վերագրի իրան 20։ Այսինքն maxNum 10 եր փողվում ա 20
           i = 20 մեծ ա՞ 30 (maxNum) ից (false) վերագրի իրան 30։ Այսինքն maxNum 20 եր փողվում ա 30
           i = 30 մեծ ա՞ 77 (maxNum) ից (false) վերագրի իրան 77։ Այսինքն maxNum 30 եր փողվում ա 77
           i = 77 մեծ ա՞ 5 (maxNum) ից (true) ուրեմն տպի արդյունքը 77։
        */
        for (int i : rand) {
            if (i > maxNum)
                maxNum = i;
        }
        for (int i = 0; i < rand.length; i++) {
            System.out.print(rand[i] + " ");
        }
        System.out.println();
        System.out.print("Maximum number = " + maxNum);
    }
}
