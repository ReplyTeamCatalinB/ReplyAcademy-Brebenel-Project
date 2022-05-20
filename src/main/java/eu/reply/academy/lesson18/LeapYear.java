package eu.reply.academy.lesson18;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input year: ");
        year = scanner.nextInt();
        // a leap year is a year divisible by 4 and not divisible by 100
        // or is a year divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("It's a leap year.");
        } else {
            System.out.println("It's not a leap year.");
        }
    }
}