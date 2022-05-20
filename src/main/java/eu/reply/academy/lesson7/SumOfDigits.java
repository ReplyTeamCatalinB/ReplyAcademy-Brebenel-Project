package eu.reply.academy.lesson7;

public class SumOfDigits {

    /*
    Create a function that takes one, two or more numbers as arguments
    and adds them together to get a new number. The function then repeatedly
     multiplies the digits of the new number by each other, yielding a new number,
      until the product is only 1 digit long. Return the final product.

Examples
sumDigProd(16, 28) ➞ 6
// 16 + 28 = 44
// 4 * 4 =  16
// 1 * 6 = 6

sumDigProd(0) ➞ 0

sumDigProd(1, 2, 3, 4, 5, 6) ➞ 2
     */

    public static void main(String[] args) {
        System.out.println(sumOfDigitsProd(1,2,3,4,5,6 ));

    }

    public static int sumOfDigitsProd(int... valori) {

        int sum = SumOfDigits.sumaValorilor(valori);
        int inmultire = SumOfDigits.inmultireNumar(sum);
        while (inmultire / 10 != 0) {
            inmultire = SumOfDigits.inmultireNumar(inmultire);
        }
        System.out.println("Rezultatul este " + inmultire);
        return inmultire;
    }

    public static int sumaValorilor(int... valori) {
        int sum = 0;
        for (int i = 0; i < valori.length; i++) {
            sum += valori[i];
        }
        return sum;
    }

    public static int inmultireNumar(int numar) {
        if (numar == 0) {
            return 0;
        }
        int inmultire = 1;
        while (numar != 0) {
            inmultire *= numar % 10;
            numar = numar / 10;
        }
        return inmultire;
    }

}




/*
 public static int sumDigProd(int... valori) {
        int sum = Problem.sumaValorilor(valori);
        int inmultire = Problem.inmultireNumar(sum);
        while (inmultire / 10 != 0) {
            inmultire = Problem.inmultireNumar(inmultire);
        }
        System.out.println("Rezultatul este " + inmultire);
        return inmultire;
    }

    public static int sumaValorilor(int... valori) {
        int sum = 0;
        for (int i = 0; i < valori.length; i++) {
            sum += valori[i];
        }
        return sum;
    }

    public static int inmultireNumar(int numar) {
        if (numar == 0) {
            return 0;
        }
        int inmultire = 1;
        while (numar != 0) {
            inmultire *= numar % 10;
            numar = numar / 10;
        }
        return inmultire;
    }
 */