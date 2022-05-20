package eu.reply.academy.lesson6;

import java.util.Arrays;

public class SplitNumber {
    public static void main(String[] args) {
        int n = 101;
        System.out.println(Arrays.toString(intoarce(n)));
    }

    public static int[] intoarce(int n) {
        int[] a = new int[4];
        int i = 0;
        while(n!=0){
            a[i] = n%10;
            n/=10;
            i++;
        }
        return a;
    }
}
