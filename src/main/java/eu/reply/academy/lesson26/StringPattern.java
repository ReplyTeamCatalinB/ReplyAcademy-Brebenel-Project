package eu.reply.academy.lesson26;

public class StringPattern {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= cols; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("j");
                    } else {
                        System.out.print("a");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("a");
                    } else {
                        System.out.print("j");
                    }
                }

            }
            System.out.println();
        }
    }

}

