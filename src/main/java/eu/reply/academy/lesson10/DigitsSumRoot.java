package eu.reply.academy.lesson10;

public class DigitsSumRoot {
    public static void main(String[] args) {

        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigitsRoot(123));
    }

    public static int sumOfDigits(long number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;

        }
        return sum;

    }

    public static long sumOfDigitsRoot(long n) {
         int sum = sumOfDigits(n);

        if (sum <= 9) {
            return sum;
        } else {
            return sumOfDigitsRoot(sum);
        }
    }
}
