package eu.reply.academy.lesson9;

public class RecursiveEx1 {

    public static void main(String[] args) {

        System.out.println(mathPow(10, 3));


    }

    public static int mathPow(int n, int p) {

        int result;

//        for (int i = 1; i <= p; i++) {
//            result *= n;
//        }

        int i = 1;
        result = mathPowRecursive(i, p, n);
        return result;

    }

    public static int mathPowRecursive(int i, int p, int n) {

        if (i > p) {
            return 1;
        } else {
            return n * mathPowRecursive(i + 1, p, n);
        }


    }


}

//[5:15 PM] Angela Stanciu
//public static int powRecursiv(int p, int n) {
//    if (p == 0)
//        return 1;
//    else
//        return n * powRecursiv(p - 1, n);
//}
//
//[5:15 PM] Angela Stanciu
//public static int[] inversareVectorRecursiv(int i, int[] vector, int[] vectorInvers) {
//    if (i == vector.length) {
//        return vectorInvers;
//    } else {
//        vectorInvers[i] = vector[vector.length - i - 1];
//        i++;
//        return inversareVectorRecursiv(i, vector, vectorInvers);
//    }
//}
