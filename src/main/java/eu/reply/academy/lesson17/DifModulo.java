package eu.reply.academy.lesson17;

import java.util.Scanner;

public class DifModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of elements: ");
        int noOfElements = scanner.nextInt();
        int[] array = new int[noOfElements];
        System.out.print("Write the elements of the array: ");
        for (int i = 0; i < noOfElements; i++) {
            array[i] = scanner.nextInt();
        }

//        difernta in valoarea absolute dintre nr de valori
//        pare si nr de valori impare

        int evenNumber = 0;
        int oddNumbers= 0;

        for (int i = 0;i < noOfElements;i++) {
            if (array[i] % 2 == 0) {
                evenNumber++;


            }else {
                oddNumbers++;
            }
        }

//        int difference;
//        if (evenNumber>oddNumbers) {
//            difference = evenNumber - oddNumbers;
//        }else {
//            difference=oddNumbers - evenNumber;
//        }
        int difference = evenNumber - oddNumbers;
        if (difference < 0) {
            difference = -difference;
        }
        System.out.println(difference);
    }
}
