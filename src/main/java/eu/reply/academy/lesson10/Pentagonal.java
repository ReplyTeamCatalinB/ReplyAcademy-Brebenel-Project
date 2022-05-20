package eu.reply.academy.lesson10;

public class Pentagonal {
    public static void main(String[] args) {
        System.out.println(pentagonalCount(10));
    }

    public static int pentagonalCount(int n) {


        if (n <= 0) {
            return 1;
        } else {
        }  return pentagonalCount(n - 1) + 5 * (n - 1);
    }
}
