package eu.reply.academy.lesson8;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(factorialIs(3));
    }

    public static int factorialIs(int a) {

        int prod = 1;
        for (int i = 1; i <= a; i++) {
            prod *=i;
        }

            return prod;
    }

}

//Angela Stanciu3:06 PMpublic static long calculeazaFactorialRecursiv(int numar) {
//    if (numar == 0) {
//        return 1;
//    } else {
//        return numar*calculeazaFactorialRecursiv(numar-1);
//    }
//}