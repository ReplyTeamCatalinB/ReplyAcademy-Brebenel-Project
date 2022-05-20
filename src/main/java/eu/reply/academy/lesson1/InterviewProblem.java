package eu.reply.academy.lesson1;


public class InterviewProblem {

    public static void main(String[] args) {
        int matrix[] = divisor(15);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] != 0) {
                System.out.println(matrix[i]);
            }
        }

        // O metoda care primeste ca parametri un numar int si returneaza un vector care contine divizorii numarului
        // Ex : 20 -> 1 2 4 5 10 20

    }

    public static int[] divisor(int n) {
        int matrix[] = new int[20];
        int count = 1;
        matrix[0] = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                matrix[count] = i;
                count++;
            }
        }
        matrix[count] = n;
        return matrix;
    }
}

// n = 15 -> 1,3,5,15,15
// n = 35 -> 1,3,5,7,35
// n = 20 -> 1,2,4,5,10,20
