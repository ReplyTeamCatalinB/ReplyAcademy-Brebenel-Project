package eu.reply.academy.lesson17;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 13;
        int n3 = 14;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int max=0;


        sum1 = n1 % 10 + n1 / 10 % 10;
        sum2 = n2 % 10 + n2 / 10 % 10;
        sum3 = n3 % 10 + n3 / 10 % 10;

        if (n1 > n2 && n1 > n3) {
            System.out.println("Digits are: " + n1 % 10 + " and " + n1 / 10);
        } else if (n2 > n3 && n2 > n1) {
            System.out.println("Digits are: " + n2 % 10 + " and " + n1 / 10);
        } else {
            System.out.println("Digits are: " + n3 % 10 + " and " + n1 / 10);
        }

        if (sum1 > sum2 && sum1 > sum3) {
            max = n1;

        } else if (sum2 > sum3 && sum2 > sum1) {
            max = n2;
        } else {
            max = n3;
        }


        System.out.println("The number with the max sum of digits is: " + max);

    }


}


