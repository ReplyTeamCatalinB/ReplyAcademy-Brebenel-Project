package eu.reply.academy.lesson17;

import java.util.Scanner;

public class MultipleOfLastElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements: ");
        int noOfElements = scanner.nextInt();
        int[] array = new int[noOfElements];
        System.out.print("Write the elements of the array: ");
        for (int i = 0; i < noOfElements; i++) {
            array[i] = scanner.nextInt();
        }

        //Sa se afiseze elementele din vector care sunt multipli ai ultimului element
//
//        for (int i = 0; i < noOfElements; i++) {
//            System.out.print(array[i] + " ");
//        }


        for (int i = 0; i < noOfElements -1; i++) {
            if (array[i] % array[noOfElements-1] == 0) {
                System.out.println(array[i]);
            }
        }


    }
}
