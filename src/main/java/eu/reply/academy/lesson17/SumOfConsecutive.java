package eu.reply.academy.lesson17;

import java.util.Scanner;

public class SumOfConsecutive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number: ");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;


        while (number1 != number2) {
            number1 = number2;
            System.out.println("Enter number: ");
            number2 = scanner.nextInt();
            sum += number2;

        }
        System.out.println("Done " + sum);
    }

}

