package eu.reply.academy.lesson22;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("My number is : ");
        int number = scanner.nextInt();


        System.out.println(number % 2 == 0 ? "even" : "odd");
    }
}
