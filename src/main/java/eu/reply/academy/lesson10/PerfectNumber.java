package eu.reply.academy.lesson10;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(perfectNr(28));
    }

    public static boolean perfectNr(int number) {

        int sum= 0;
        for (int i =1; i <= number;i++) {
            if (number % i ==0) {
                System.out.print(i + " " );
                sum =+ i;

            }



        }
//        if(sum == number) {
//            return true;
//        }else {
//            return false;
//        }
        return sum == number ? true : false;

    }
}
