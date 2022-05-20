package eu.reply.academy.lesson16;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value: ");

        int rows = s.nextInt();

        int i = 0;
        while (i<= rows) {


            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }

            i++;
            System.out.println();
        }
    }
}

