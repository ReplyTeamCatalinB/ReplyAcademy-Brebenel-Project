package eu.reply.academy.lesson16;

import java.util.Scanner;

public class EvenNumbers {

    //Acum va rog faceti un programel care afiseaza
    // primele n numere naturale in ordine inversa
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 1;i--) {
            System.out.print(i + " ");

        }
    }
}
