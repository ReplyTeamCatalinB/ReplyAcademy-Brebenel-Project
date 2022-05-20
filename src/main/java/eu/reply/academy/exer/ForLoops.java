package eu.reply.academy.exer;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForLoops {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(returnEvenNo(30)));
    }

    public static int[] returnEvenNo(int n) {
        int[] arr = new int[20];
        arr[0] = 2;
        for (int i = 2; i <= n; i = i +2) {
            arr[i/2-1] = i;
        }
        return arr;
    }

}
