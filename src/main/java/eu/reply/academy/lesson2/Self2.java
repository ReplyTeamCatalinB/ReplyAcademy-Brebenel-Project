package eu.reply.academy.lesson2;

public class Self2 {
    public static void main(String[] args) {
//        O metoda care primeste un numar in ca parametru si intoarce inapoi suma divizorilor numarului impartita
//        la numarul de divizori
        System.out.println(sumOfDivisors(10));

    }
// TODO: 3/15/2022  make it with array

    public static double sumOfDivisors(int number) {

        double sum = 1 + number;
        int count = 2;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
                sum += i;
            }
        }
        return sum / count;
    }
}

/*
//O metoda care primeste un numar int ca parametru si intoarce inapoi
// suma divizorilor numarului impartita la numarul de divizori
public class MediaAritmeticaDivizori {
    public static void main(String[] args) {
        System.out.println(media(10));
        // 10 -> 1, 2, 5, 10;
        // sum = 18
        // ma = 4.5
    }

    public static double media(int n) {
        int[] v = new int[20];
        //v[0] = 1;
        int c = 2;
        double sum = 1 + n;
        double ma = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                //v[c] = i;
                c++;
                sum = sum + i;
            }
            //v[n] = n;
        }

        ma = sum / c;
        return ma;
    }
}
 */