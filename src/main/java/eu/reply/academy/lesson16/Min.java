package eu.reply.academy.lesson16;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int min;

        if(number1 < number2) {
            if (number3 < number1) {
                min = number3;
            } else {
                min = number1;
            }
        } else{
            if (number2 < number3) {
                min = number2;
            } else {
                min = number3;
            }
        }

        System.out.println("Min = "+ min);
    }
}

