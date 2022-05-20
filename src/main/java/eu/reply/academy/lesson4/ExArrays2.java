package eu.reply.academy.lesson4;

import java.util.Arrays;

public class ExArrays2 {
    /*
    O metoda care primeste un vector de numere intregi. Impartim numerele in 3 vectori astfel : in primul vector numerele divizibile cu 3,
     in al doilea cele care au restul impartirii la 3 egal 1, iar in ultimul numerele care au restul impartirii la 3 egal 2.
Metoda va intoarce inapoi urmatoarele :
a) Daca vectorul cu cea mai mare dimensiune este vectorul cu numerele divizibile cu 3 => suma numerelor din acest vector
b) Daca vectorul cu cea mai mare dimensiune este vectorul cu numerele care au restul impartirii la 3 egal cu 1 => cel mai mic numar din acest vector
c) Daca vectorul cu cea mai mare dimensiune este vectorul cu numerele care au restul impartirii la 3 egal cu 2 => daca are nr
 impar de element => numarul din mijlocul vectorului, daca nu atunci media aritmetica a numerelor din mijloc
     */


    public static void main(String[] args) {
        int[] matrix = {2, 5, 6, 2, 5, 7, 1, 0, 7, 1};
        float result = calculeaza(matrix);
        System.out.println(result);
    }

    public static float calculeaza(int[] matrix) {
        int[] matrixDiv3 = new int[matrix.length];
        int[] matrix3With1 = new int[matrix.length];
        int[] matrix3With2 = new int[matrix.length];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int i = 0;
        while (i < matrix.length) {
            if (matrix[i] % 3 == 0) {
                matrixDiv3[count1] = matrix[i];
                count1++;
            } else if (matrix[i] % 3 == 1) {
                matrix3With1[count2] = matrix[i];
                count2++;
            } else if (matrix[i] % 3 == 2) {
                matrix3With2[count3] = matrix[i];
                count3++;
            }
            i++;
        }
        float result = 0;
        if ((count1 >= count2) && (count1 >= count3)) {
            System.out.println("Primul matrix este mai mare");
            System.out.println("Are un numar de elemente:" + count1);
            int suma = 0;
            int j = 0;
            while (j < count1) {
                suma += matrixDiv3[j];
                j++;
            }
            result = suma;
            System.out.println("Suma elementelor (in afara de zerouri) este:" + result);
        }
        if ((count2 >= count1) && (count2 >= count3)) {
            System.out.println("Al doilea matrix este mai mare");
            System.out.println("Are un numar de elemente:" + count2);
            int minim = matrix3With1[0];
            int k = 1;
            while (k < count2) {
                if (matrix3With1[k] < minim) {
                    minim = matrix3With1[k];
                }
                k++;
            }
            result = minim;
            System.out.println("Minimul este (in afara de zerouri):" + result);
        }
        if ((count3 >= count1) && (count3 >= count2)) {
            System.out.println("Al treilea matrix este mai mare");
            System.out.println("Are un numar de elemente:" + count3);
            int mijloc = count3 / 2;
            if (count3 % 2 != 0) {
                System.out.println("Vectorul are numar impar de elemente");
                result = matrix3With2[mijloc];
                System.out.println("Mijlocul - pozitia i (se porneste de la zero) este:" + mijloc);
                System.out.println("Mijlocul este:" + result);
            } else {
                System.out.println("Vectorul are numar par de elemente");
                System.out.println("V[1]=" + matrix3With2[mijloc]);
                System.out.println("V[2]=" + matrix3With2[mijloc - 1]);
                float medie = (matrix3With2[mijloc] + matrix3With2[mijloc - 1]) / 2;
                //float medie2= (5+2)/2;
                result = medie;
                System.out.println("Media este:" + result);
            }
        }
        System.out.println("Primul matrix div 3 = 0:" + Arrays.toString(matrixDiv3));
        System.out.println("Al doilea matrix div 3 = 1" + Arrays.toString(matrix3With1));
        System.out.println("Al treilea matrix div 3 = 2:" + Arrays.toString(matrix3With2));
        return result;
    }

}



//    public static void main(String[] args) {
//        int[] parameter = new int[]{6,10,12,15,22};
//
//
//        returnTheSpecificValue(parameter);
//
//
//
//    }


//    public static  void returnTheSpecificValue(int[] parameter) {
//
//        int[] numbersDivisibleBy3 = new int[parameter.length];
//        int[] numbersDivisibleBy3Rest1 = new int[parameter.length];
//        int[] numbersDivisibleBy3Rest2 = new int[parameter.length];
//
//        int count1=0;
//        int count2=0;
//        int count3=0;
//
//        int i = 0;
//
//        while (i< parameter.length) {
//            if (parameter[i] % 3 == 0) {
//                numbersDivisibleBy3[count1] = parameter[i];
//                count1++;
//
//            }else if (parameter[i] % 3 ==1) {
//                numbersDivisibleBy3Rest1[count2] = parameter[i];
//                count2++;
//            }else {
//                numbersDivisibleBy3Rest2[count3] =parameter[i];
//                count3++;
//            }
//            i++;
//        }
//
//        int sumOfNumbersDivisibleBy3 = 0;
//
//        if ((count1 >= count2) && (count1> count3)) {
//            sumOfNumbersDivisibleBy3 += numbersDivisibleBy3[i];
//        }








//        System.out.println((sumOfNumbersDivisibleBy3));
//        System.out.println(Arrays.toString(numbersDivisibleBy3));
//        System.out.println(Arrays.toString(numbersDivisibleBy3Rest1));
//        System.out.println(Arrays.toString(numbersDivisibleBy3Rest2));



