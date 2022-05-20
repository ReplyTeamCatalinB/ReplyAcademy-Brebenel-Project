package eu.reply.academy.lesson16;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");

        int n = sc.nextInt();
        int c = sc.nextInt();
        int r = sc.nextInt();

        int m = n / c *c+ c + r;

        System.out.println("Min = " + m);


    }
}
