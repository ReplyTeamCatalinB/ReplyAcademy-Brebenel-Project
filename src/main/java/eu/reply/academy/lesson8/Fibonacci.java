package eu.reply.academy.lesson8;

public class Fibonacci {

//    f(n) = f(n-1) + f(n -2)
//    f(0)=0
//    f(1)=1
    // Fibonacci is a sequence of numbers where the first two numbers
    // in sequence are 1 and 1 then each additional number is the sum
    // of the two previous numbers.

    //Ex: 1 1 2 3 5 8

    //Write a prog that reads and int N and displays the nth fib nr

    //Ex: n = 4;
    // 1+1 =2 1+2 = 3  2 steps to get the nth fib nr we need n-2 steps


    public static void main(String[] args) {


        System.out.println(fibonacciMethod(4));

    }

    public static int fibonacciMethod(int n) {
        if (n == 0) {
            return 0;
        }

        int result = 0;
        int v1 = 0;
        int v2 = 1;

        for (int i = 1; i <= n - 1; i++) {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }

        return (result == 0 ? 1 : result);
    }
}

//public static int sirFibonnaciRecursiv(int numar) {
//    if (numar == 0) {
//        return 0;
//    } else if (numar == 1) {
//        return 1;
//    } else {
//        return sirFibonnaciRecursiv(numar-1)+sirFibonnaciRecursiv(numar-2);
//    }
//}
