package eu.reply.academy.lesson8;

public class SumOfDigitsOfIntegers {

    public static void main(String[] args) {
        System.out.println(sumDigits(111));
        System.out.println(sumDigitsRecursive(111));

    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }


    public static int sumDigitsRecursive(int number) {

        if (number < 0) {
            return 0;
        }else {
            return (number % 10 + sumDigitsRecursive(number/10));
        }

    }

}
