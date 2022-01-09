public class homTaskif {

    public static void main(String[] args) {

        int random = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        // task 1
//        int plusRandNum = random + random2;
//        System.out.println("Random numbers " + random + " and " + random2 + " " + "added. Result : " + plusRandNum);

        // task 2
//        if (random == random2) {
//            System.out.println("Random numbers is equals");
//        } else if (random > random2) {
//            System.out.println(random + " numbers is bigger than " + random2);
//        } else {
//            System.out.println(random2 + " numbers is bigger than " + random);
//        }

        // task 3
//        if (random % 2 == 0) {
//            int result = random / 2;
//            System.out.println("This numbers " + random + " divisible by 2");
//            System.out.println("Result is " + result);
//          } else if (random2 % 2 == 0) {
//            int result2 = random2 / 2;
//            System.out.println("This numbers " + random2 + " divisible by 2");
//            System.out.println("Result is " + result2);
//        } else {
//            System.out.println("Random numbers is odd");
//        }

        // 4 task
//            if (random >= 5 && random2 < 5) {
//                int numAdd = random + random2;
//                System.out.println("Random numbers " + random + " and " + random2 + " " + "added. Result : " + numAdd);
//            } else if (random > 5 || random2 > 5) {
//                System.out.println("Random number bigger than 5");
//            } else {
//                System.out.println("Random numbers " + random + " and " + random2 + " " + "small");
//            }

        // 5 task
//            int minusTwo = random2 - 2;
//            int plusFive = random + 5;
//            if (minusTwo < random || plusFive >= random2) {
//                int plusNumbers = minusTwo + plusFive;
//                System.out.println("Random numbers " + random + " and " + random2 + " " + "added. Result : " + plusNumbers);
//            } else {
//                System.out.println("Random numbers are small");
//            }

        // 6 task

        int oldValue = random;
        random++;
        random2--;
        random = random * random2;
        if (random > 10 || random != 10) {
            System.out.println("Random number : " + random);
        } else {
        System.out.println("Old random number: " + oldValue);
        }
    }
}
