public class homTaskif {
    public static void main(String[] args) {

        int random = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);

        // task 1
//        int plusRandNum = random + random2;
//        System.out.println("Random numbers " + random + " and " + random2 + " " + "added. Result : " + plusRandNum);

        // task 2
            if(random==random2){
                System.out.println("Random numbers is equals " + random + " and " + random2);
            } else if (random > random2){
                System.out.println(random + " numbers(r1) is bigger than " + random2);
            } else {
                System.out.println(random2 + " numbers(r2) is bigger than " + random);
            }

        // task 3
//        if (random % 2 == 0) {
//            int result = random / 2;
//            System.out.println("This numbers " + random + " divisible by 2");
//            System.out.println("Result is " + result);
//        } else if (random2 % 2 == 0) {
//            int result2 = random2 / 2;
//            System.out.println("This numbers " + random2 + " divisible by 2");
//            System.out.println("Result is " + result2);
//        } else if (random % 2 != 0){
//            int oddRandom = random;
//            System.out.println("This numbers is odd " + oddRandom);
//        } else if (random2 % 2 != 0) {
//            int oddRandom2 = random2;
//            System.out.println("This numbers is odd " + oddRandom2);
//        }

        // 4 task
//        if (random >= 5 && random2 < 5) {
//                int numAdd = random + random2;
//                System.out.println("Random numbers " + random + " and " + random2 + " " + "added. Result : " + numAdd);
//            } else if (random > 5 || random2 > 5) {
//                System.out.println("Random number bigger than 5");
//            } else {
//            System.out.println("Random numbers " + random + " and " + random2 + " " + "small");
//        }

        // 5 task
//        int minusTwo = random2 - 2;
//        int plusFive = random + 5;
//        if (minusTwo < random || plusFive >= random2) {
//            int plusNumbers = minusTwo + plusFive;
//            System.out.println("Random numbers " + random + " and " + random2 + " " + "added. Result : " + plusNumbers);
//        } else {
//            System.out.println("Random numbers are small");
//        }

        //6 task
       /* int random = 9;
        int random2 = 11;
        for check else
       */
//        random++;
//        random2--;
//        int randomNumPlus = random + random2;
//        if (random > 10 || random != 10) {
//            System.out.println("Random numbers " + random + " and " + random2 + " " + "added. Result : " + randomNumPlus);
//        } else {
//            random--;
//            System.out.println("Old value to the first random number " + random);
//        }
    }
}