package eu.reply.academy.lesson2;

public class Self1 {
    public static void main(String[] args) {

//        O metoda care primeste un numarul int ca parametru si intoarce inapoi un vector care contine toate numerele
//        mai mici sau egale cu n care sunt divizibile cu 3 sau 5

        int[] self1 = doIt(25);
        for (int i = 0; i < self1.length; i++) {
            if (self1[i] != 0) {
                System.out.println(self1[i]);
            }
        }

    }

    public static int[] doIt(int number) {

        int[] numbers = new int[30];
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                numbers[count] = i;
                count++;
            }
        }
        return numbers;
    }
}

/*
//O metoda care primeste un numarul int ca parametru si intoarce inapoi un vector
// care contine toate numerele mai mici sau egale cu n care sunt divizibile cu 3 sau 5
public class NumereDivizibile3Sau5 {
    public static void main(String[] args) {
        int[] vector = checkDiv(10);
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 0) {
                System.out.println(vector[i]);
            }
        }
    }

    public static int[] checkDiv(int n) {
        int[] v = new int[20];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                v[i - 1] = i;
            }
        }
        return v;
    }
}
 */
