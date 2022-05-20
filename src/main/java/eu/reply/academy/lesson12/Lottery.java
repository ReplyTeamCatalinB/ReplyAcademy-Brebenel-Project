package eu.reply.academy.lesson12;

import java.util.Random;

public class Lottery {

    //public static void main(String[] args) {
    //        // we store the 6 numbers on the lottery ticket
    //        // using an array of int with 6 elements
    //        int[] ticket = new int[6];
    //        Random random = new Random();
    //        int noOfGeneratedNumbers = 0;
    //        while (noOfGeneratedNumbers < ticket.length) {
    //            // we generate a number between 1 and 30
    //            // random.nextInt(30) generate a number between 0 and 29
    //            // by adding 1 we get numbers between 1 and 30
    //            int luckyNumber = random.nextInt(30) + 1;
    //            boolean isUnique = true;
    //            // we check if the generated number is unique
    //            // that means that is not already on the ticket

    //            for (int i = 0; i < noOfGeneratedNumbers; i++) {
    //                if (luckyNumber == ticket[i]) {
    //                    isUnique = false;
    //                }
    //            }
    //            if (isUnique) {
    //                ticket[noOfGeneratedNumbers] = luckyNumber;
    //                noOfGeneratedNumbers++;
    //                //ticket[noOfGeneratedNumbers-1] = luckyNumber;
    //            }
    //        }
    //        System.out.println("The lucky numbers are:");
    //        for (int i = 0; i < ticket.length; i++) {
    //            System.out.print(ticket[i]+" ");
    //        }
    //    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};

//        double nr = Math.random() * arr1.length;
//
//        System.out.println(arr1[(int) nr]);

        luckyNumbers(arr1,2);
    }


    public static int[] luckyNumbers(int[] arr, int luckyArrSize) {
        int[] luckyArr = new int[luckyArrSize];
        Random random = new Random();
        int noOfGeneratedNr = 0;

        while (noOfGeneratedNr < luckyArrSize) {
            int luckyIndex = random.nextInt(arr.length);
            int luckyNumber = arr[luckyIndex];
            System.out.println("Lucky nr : " + luckyNumber);
            boolean isUnique = true;
           for (int i = 0; i < noOfGeneratedNr;i++) {
               if (luckyNumber == luckyArr[i]) {
                   isUnique= false;
                   break;
               }
           }

           if (isUnique) {
               luckyArr[noOfGeneratedNr] = luckyNumber;
               noOfGeneratedNr++;
           }
        }

        for(int i = 0; i < luckyArr.length; i++) {
            System.out.print(luckyArr[i] + " ");
        }

        return luckyArr;
    }
}
