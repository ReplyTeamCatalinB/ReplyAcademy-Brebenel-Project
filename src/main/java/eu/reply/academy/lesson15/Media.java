package eu.reply.academy.lesson15;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a,b,c;


        System.out.println("Enter 3 numbers: ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        double average = (a+b+c) / 3.0; //sau double average = (a+b+c) / (double)3.0;  sau double average = ((double)a+b+c) / 3.0;  ia valoarea celei mai mari valori de tipuri, in cazul asta double

        System.out.println("Average= " + average );
    }
}
