package eu.reply.academy.lesson4;

import java.util.Arrays;

public class OddEvenArrays {
    public static void main(String[] args) {

        int[] parameter = new int[]{1,5,8,9,12};
        //afiseazaNumereleFolosindFor(parameter);
        afiseazaNumereleFolosindWhile(parameter);
        //5.O metoda care primeste un vector de int si nu intoarce nimic ( void ).
        // In metoda declaram 2 vectori.In primul punem nr pare din vectorul primit,
        // iar in al doilea vector pune nr impare. Sa afisam ambii vectori
        //Ex : p = {1,5,8,9,12} -> pare = {8,12} , impare = {1,5,9} -> Numerele pare : 8,12 Numerele impare : 1,5,9
    }

    public static void afiseazaNumereleFolosindFor(int[] parameter) {
        int[] pare = new int[parameter.length];
        int[] impare = new int[parameter.length];
        int c1=0;
        int c2=0;
        for(int i=0;i<parameter.length;i++) {
            if(parameter[i]%2 == 0) {
                pare[c1] = parameter[i];
                c1++;
            } else {
                impare[c2] = parameter[i];
                c2++;
            }
        }

        System.out.println(Arrays.toString(pare));
        System.out.println(Arrays.toString(impare));
    }

    public static void afiseazaNumereleFolosindWhile(int[] parameter) {
        int[] pare = new int[parameter.length];
        int[] impare = new int[parameter.length];
        int c1=0;
        int c2=0;
        int i=0;
        while(i<parameter.length) {
            if(parameter[i]%2 == 0) {
                pare[c1] = parameter[i];
                c1++;
            } else {
                impare[c2] = parameter[i];
                c2++;
            }
            i++;
        }

//        for(int i=0;i<parameter.length;i++) {
//            if(parameter[i]%2 == 0) {
//                pare[c1] = parameter[i];
//                c1++;
//            } else {
//                impare[c2] = parameter[i];
//                c2++;
//            }
//        }
        System.out.println(Arrays.toString(pare));
        System.out.println(Arrays.toString(impare));
    }

}

