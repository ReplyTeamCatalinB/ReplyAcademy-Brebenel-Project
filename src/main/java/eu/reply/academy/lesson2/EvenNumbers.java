package eu.reply.academy.lesson2;

import java.util.Arrays;

public class EvenNumbers {


    public static void main(String[] args) {

        EvenNumbers evenNumbers = new EvenNumbers();
        System.out.println(Arrays.toString(evenNumbers.returnThis(30)));
        System.out.println(Arrays.toString(evenNumbers.returnThisButBetter(30)));
    }

    public int[] returnThis(int n) {

        int[] arr = new int[20];

        int count = 0;
        for(int i = 2; i <= n;i++) {
            if (i % 2 == 0) {
                arr[count] = i;
                count++;
            }
        }

        return arr;
    }

    public int[] returnThisButBetter(int n) {
        int[] arr = new int[20];
        arr[0] = 2;
        for (int i = 2; i <= n; i = i + 2) {
            arr[i /2 -1] = i;
        }

        return arr;
    }














//        public static void main(String[] args) {
//
//            //O metoda care primeste un int n ca parametru si intoarce un vector care contine toate numerele pare mai mici sau egale decat n
//            // Ex : 15 -> 2,4,6,8,10,12,14
//            // Ex : 8 -> 2,4,6,8
//            // Ex : 12 -> 2,4,6,8,10,12
////        int[] numerePare = dummyNumerePare(10);
//            int[] numerePare = godNumerePare(10);
//            for (int i = 0; i < numerePare.length; i++) {
//                if (numerePare[i] != 0) {
//                    System.out.println(numerePare[i]);
//                }
//            }
//
//        }
//
//        public static int[] dummyNumerePare(int number) {
//
//            int[] evenNumbers = new int[20];
//            int c = 0;
//            for (int i = 2; i <= number; i++) {
//                if (i % 2 == 0) {
//                    evenNumbers[c] = i;
//                    c++;
//                }
//            }
//
//            return evenNumbers;
//        }
//
//        public static int[] godNumerePare(int number) {
//
//            int[] evenNumbers = new int[20];
////        evenNumbers[0] = 2;
//            for (int i = 2; i <= number; i = i + 2) {
//                evenNumbers[i / 2 - 1] = i;
//            }
//
//            return evenNumbers;
//        }

    }


