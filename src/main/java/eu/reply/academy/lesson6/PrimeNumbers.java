package eu.reply.academy.lesson6;

//How Many "Prime Numbers" Are There?
// Create a function that finds how many prime numbers there are, up to the given integer.
//Examples
//primeNumbers(10) ➞ 4
// 2, 3, 5 and 7
//primeNumbers(20) ➞ 8
// 2, 3, 5, 7, 11, 13, 17 and 19
import java.util.Arrays;
// primeNumbers(30) ➞ 10
// 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29
public class PrimeNumbers {
    public static void main(String[] args) {
//        int count=findPrimeNumbers(10);
        System.out.println(Arrays.toString(findPrimeNumbers(10)));
    }

    public static int[] findPrimeNumbers(int n) {
        int count = 0;
        int[] v = new int[10];
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                v[i] = i;
                count++;
            }
        }
        System.out.println(count);
        return v;
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            System.out.println("There are no prime numbers here");
            return false;
        }
        for (int i = 2; i <= n; i++) {
            if ((n % i == 0) && (n != i)) {
                return false;
            }
        }
        return true;
    }
}

