package eu.reply.academy.lesson4;

import java.util.Arrays;

public class ExArrays {
    public static void main(String[] args) {

        String[] parameter = new String[]{"1", "2", "4", "6", "10"};
        //parameter[0] = parameter[2];
//        String aux = parameter[2];
//        parameter[2] = parameter[0];
//        parameter[0] = aux;
        // 4 2 1 6 10
        String[] reversed = reverse(parameter);
        System.out.println(Arrays.toString(parameter));
        // 4 2 4 6 10
        // 4 2 4 6 10
        // 4 2 4 6 10
    }

    // o metoda care primeste ca si parametru un vector de string si intoarce inapoi inversul vectorului
    // ex. v = {a, b, e, f} -> v = {f, e ,b, a}
    // ex. p = {1, 2, 4, 6, 10} -> r = {10, 6, 4, 2, 1}
    // r[0] = p[4]; r[1] = p[3]; r[2] = p[2]; r[3] = p[1]; r[4] = p[0].
    // parameter.length = 5
    // i = 4                                    // i=4
    // r[0]                                     // p[4]
    // 0 = parameter.lenght-i-1 ( 5-5)            // 4 = i
    // i=3                                      // i =4
    // r[1]                                     // p[3]
    // 1 = parameter.length-i-1                   // 3 = i
    public static String[] reverse(String[] parameter){

        //p = {1, 2, 4, 6, 10} -> p = {10, 6, 4, 2, 1}
//        String aux = parameter[2];
//        parameter[2] = parameter[0];
//        parameter[0] = aux;
        //String[] reversed = new String[parameter.length];
        String aux;
        for(int i = parameter.length-1; i >= (parameter.length-1)/2; i--){
//            reversed[parameter.length-i-1] = parameter[i];
            aux = parameter[parameter.length-i-1];
            parameter[parameter.length-i-1] = parameter[i];
            parameter[i] = aux;
        }

        return parameter;
        // 10 6 4 2 1
    }
}
