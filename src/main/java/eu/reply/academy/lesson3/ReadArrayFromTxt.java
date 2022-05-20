package eu.reply.academy.lesson3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadArrayFromTxt {
    public static void main(String[] args) {
        ReadArrayFromTxt read = new ReadArrayFromTxt();
        read.readfile();
        read.sumOnDiagonal();


    }


    public void readfile() {
        File file = new File("C:\\Java\\tx.txt");
        int rows;
        int columns;
        try {
            Scanner scanner = new Scanner(file);
            String[] line = scanner.nextLine().trim().split(" "); //[3 3] // Citeste urmatoarea linie
            rows = Integer.parseInt(line[0]); // converts line string to int
            columns = Integer.parseInt(line[1]);
            int[][] matrix = new int[rows][columns];

            //System.out.print(rows + " " + columns);

            while (scanner.hasNextLine()) {
                for (int i = 0; i < rows; i++) {
                    String[] lines = scanner.nextLine().trim().split(" ");
                    for (int j = 0; j < lines.length; j++) {
                        matrix[i][j] = Integer.parseInt(lines[j]);
                    }
                }
                System.out.println(Arrays.deepToString(matrix));
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sumOnDiagonal() {

        File file = new File("C:\\Java\\tx.txt");
        int rows;
        int columns;
        int sum = 0;
        int sum2 = 0;
        try {
            Scanner scanner = new Scanner(file);
            String[] line = scanner.nextLine().trim().split(" "); //[3 3]
            rows = Integer.parseInt(line[0]);
            columns = Integer.parseInt(line[1]);
            int[][] matrix = new int[rows][columns];

            //System.out.print(rows + " " + columns);

            while (scanner.hasNextLine()) {
                for (int i = 0; i < rows; i++) {
                    String[] lines = scanner.nextLine().trim().split(" ");
                    for (int j = 0; j < columns; j++) {
                        matrix[i][j] = Integer.parseInt(lines[j]);
                        if ((i == j) && (matrix[i][j] % 2 == 0)) {   //Diagonala principala
                            sum += matrix[i][j];
                        }
                    }
                }
                System.out.println("Sum of main Diagonal: " + sum);

                for (int i = 0; i < rows; i++) {
                    if (matrix[i][matrix.length - 1 - i] % 2 == 0) {  //Diagonala secundara
                        sum2 += matrix[i][matrix.length - 1 - i];
                    }
                }
                System.out.println("Sum of secondary Diagonal: " + sum2);
                System.out.print("Total sum: ");
                System.out.print(sum + sum2);


                try (Writer wr = new FileWriter("C:\\Java\\gol.txt");) {
                    wr.write(sum + " ");
                    wr.write(sum2 + " ");
                    int totalSum = sum + sum2;
                    wr.write(totalSum + " ");
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


