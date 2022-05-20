package eu.reply.academy.lesson5;

import java.util.Arrays;

public class Neighbour {

    public static void main(String[] args) {

        int[][] matrice = new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 1, 2}};
        int x = 2;
        int y = 2;
        System.out.println("Matricea este:" + Arrays.deepToString(matrice));
        System.out.println("Elementul x - linie este:" + x);
        System.out.println("Elementul y - coloana este:" + y);
        int minimElement = Neighbour.lowestElement(matrice, x, y);
    }

    public static int lowestElement(int[][] matrice, int x, int y) {
        //x -coordonata linie
        //y -coordonata coloana
        int nrLinii = matrice.length;
        int nrColoane = nrLinii;
        int vecinStanga;
        int vecinDreapta;
        int vecinSus;
        int vecinJos;
        int vecinDiagonalaDreaptaSus;
        int vecinDiagonalaDreaptaJos;
        int vecinDiagonalaStangaSus;
        int vecinDiagonalaStangaJos;
        int minim = 0;
        try {
            for (int i = 0; i < nrLinii; i++) {
                if (x == i) {
                    int[] vectorLinie = matrice[i];
                    for (int j = 0; j < vectorLinie.length; j++) {
                        if (y == j) {
                            System.out.println("Elementul din matrice este:" + matrice[i][j]);
                            if (((i >= 1) && (i <= nrLinii - 2)) && ((j >= 1) && (j <= nrColoane - 2))) {
                                vecinStanga = matrice[i][j - 1];
                                vecinDreapta = matrice[i][j + 1];
                                vecinSus = matrice[i - 1][j];
                                vecinJos = matrice[i + 1][j];
                                vecinDiagonalaDreaptaSus = matrice[i - 1][j + 1];
                                vecinDiagonalaDreaptaJos = matrice[i + 1][j + 1];
                                vecinDiagonalaStangaSus = matrice[i - 1][j - 1];
                                vecinDiagonalaStangaJos = matrice[i + 1][j - 1];
                                System.out.println("vecinii sunt:" + vecinStanga + " " + vecinDreapta + " " + vecinSus + " " + vecinJos + " "
                                        + vecinDiagonalaDreaptaSus + " " + vecinDiagonalaDreaptaJos + " " + vecinDiagonalaStangaSus + " "
                                        + vecinDiagonalaStangaJos);
                                int[] vectorTemporar = {vecinStanga, vecinDreapta, vecinSus, vecinJos, vecinDiagonalaDreaptaSus, vecinDiagonalaDreaptaJos, vecinDiagonalaStangaSus, vecinDiagonalaStangaJos};
                                minim = Neighbour.minim(vectorTemporar);
                            } else if (((i >= 1) && (i <= nrLinii - 2)) && (j == 0)) {
                                vecinDreapta = matrice[i][j + 1];
                                vecinSus = matrice[i - 1][j];
                                vecinJos = matrice[i + 1][j];
                                vecinDiagonalaDreaptaSus = matrice[i - 1][j + 1];
                                vecinDiagonalaDreaptaJos = matrice[i + 1][j + 1];
                                System.out.println("vecinii sunt:" + vecinDreapta + " " + vecinSus + " " + vecinJos + " "
                                        + vecinDiagonalaDreaptaSus + " " + vecinDiagonalaDreaptaJos);
                                int[] vectorTemporar2 = {vecinDreapta, vecinSus, vecinJos, vecinDiagonalaDreaptaSus, vecinDiagonalaDreaptaJos};
                                minim = Neighbour.minim(vectorTemporar2);
                            } else if (((i >= 1) && (i <= nrLinii - 2)) && (j == nrColoane - 1)) {
                                vecinStanga = matrice[i][j - 1];
                                vecinSus = matrice[i - 1][j];
                                vecinJos = matrice[i + 1][j];
                                vecinDiagonalaStangaSus = matrice[i - 1][j - 1];
                                vecinDiagonalaStangaJos = matrice[i + 1][j - 1];
                                System.out.println("vecinii sunt:" + vecinStanga + " " + vecinSus + " " + vecinJos + " "
                                        + vecinDiagonalaStangaSus + " " + vecinDiagonalaStangaJos);
                                int[] vectorTemporar3 = {vecinStanga, vecinSus, vecinJos, vecinDiagonalaStangaSus, vecinDiagonalaStangaJos};
                                minim = Neighbour.minim(vectorTemporar3);
                            } else if ((i == 0) && ((j >= 1) && (j <= nrColoane - 2))) {
                                vecinStanga = matrice[i][j - 1];
                                vecinDreapta = matrice[i][j + 1];
                                vecinJos = matrice[i + 1][j];
                                vecinDiagonalaDreaptaJos = matrice[i + 1][j + 1];
                                vecinDiagonalaStangaJos = matrice[i + 1][j - 1];
                                System.out.println("vecinii sunt:" + vecinStanga + " " + vecinDreapta + " " + vecinJos + " "
                                        + vecinDiagonalaDreaptaJos + " " + vecinDiagonalaStangaJos);
                                int[] vectorTemporar4 = {vecinStanga, vecinDreapta, vecinJos, vecinDiagonalaDreaptaJos, vecinDiagonalaStangaJos};
                                minim = Neighbour.minim(vectorTemporar4);
                            } else if (((j >= 1) && (j <= nrColoane - 2)) && (i == nrLinii - 1)) {
                                vecinStanga = matrice[i][j - 1];
                                vecinDreapta = matrice[i][j + 1];
                                vecinSus = matrice[i - 1][j];
                                vecinDiagonalaDreaptaSus = matrice[i - 1][j + 1];
                                vecinDiagonalaStangaSus = matrice[i - 1][j - 1];
                                System.out.println("vecinii sunt:" + vecinStanga + " " + vecinDreapta + " " + vecinSus + " " + vecinDiagonalaDreaptaSus + " "
                                        + vecinDiagonalaStangaSus);
                                int[] vectorTemporar5 = {vecinStanga, vecinDreapta, vecinSus, vecinDiagonalaDreaptaSus, vecinDiagonalaStangaSus};
                                minim = Neighbour.minim(vectorTemporar5);
                            } else if ((i == nrLinii - 1) && (j == 0)) {
                                vecinDreapta = matrice[i][j + 1];
                                vecinSus = matrice[i - 1][j];
                                vecinDiagonalaDreaptaSus = matrice[i - 1][j + 1];
                                System.out.println("vecinii sunt:" + vecinDreapta + " " + vecinSus + " " + vecinDiagonalaDreaptaSus);
                                int[] vectorTemporar6 = {vecinDreapta, vecinSus, vecinDiagonalaDreaptaSus};
                                minim = Neighbour.minim(vectorTemporar6);
                            } else if ((i == 0) && (j == 0)) {
                                vecinDreapta = matrice[i][j + 1];
                                vecinJos = matrice[i + 1][j];
                                vecinDiagonalaDreaptaJos = matrice[i + 1][j + 1];
                                System.out.println("vecinii sunt:" + vecinDreapta + " " + vecinJos + " " + vecinDiagonalaDreaptaJos);
                                int[] vectorTemporar7 = {vecinDreapta, vecinJos, vecinDiagonalaDreaptaJos};
                                minim = Neighbour.minim(vectorTemporar7);
                            } else if ((i == 0) && (j == nrColoane - 1)) {
                                vecinStanga = matrice[i][j - 1];
                                vecinJos = matrice[i + 1][j];
                                vecinDiagonalaStangaJos = matrice[i + 1][j - 1];
                                System.out.println("vecinii sunt:" + vecinStanga + " " + vecinJos + " " + vecinDiagonalaStangaJos);
                                int[] vectorTemporar8 = {vecinStanga, vecinJos, vecinDiagonalaStangaJos};
                                minim = Neighbour.minim(vectorTemporar8);
                            } else if ((i == nrLinii - 1) && (j == nrColoane - 1)) {
                                vecinStanga = matrice[i][j - 1];
                                vecinSus = matrice[i - 1][j];
                                vecinDiagonalaStangaSus = matrice[i - 1][j - 1];
                                System.out.println("vecinii sunt:" + vecinStanga + " " + vecinSus + " " + vecinDiagonalaStangaSus);
                                int[] vectorTemporar9 = {vecinStanga, vecinSus, vecinDiagonalaStangaSus};
                                minim = Neighbour.minim(vectorTemporar9);
                            }
                        }
                    }
                }
            }
            if((x<0) || (y<0) || (x>=nrLinii) || (y>nrColoane)) {
                System.out.println("Este in afara matricii.");
            }
            System.out.println("Minimul este:" + minim);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        return minim;
    }

    public static int minim(int[] vector) {
        int min = vector[0];
        int i = 1;
        while (i < vector.length) {
            if (vector[i] < min) {
                min = vector[i];
            }
            i++;
        }
        return min;
    }
}
