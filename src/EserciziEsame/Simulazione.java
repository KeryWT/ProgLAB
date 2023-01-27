package EserciziEsame;

//import java.util.Scanner;

public class Simulazione {
    public static void main(String[] args) {

        int[][] matrice = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
        // System.out.println(e1(matrice));
        Stampa(matrice);
        System.out.println("Somma colonna 0: " + sommaC(matrice, 0, 0));
        System.out.println("Somma riga 0: " + sommaR(matrice[0], matrice.length - 1));
        System.out.println("Valore restituito:" + e2(matrice));
    }

    /*
     * ESERCIZIO 1.
     * Scrivere un metodo iterativo e1 con le seguenti
     * caratteristiche:
     * -) e1 ha un parametro formale di tipo matrice
     * bidimensionale di interi che puo' essere solo
     * quadrata, o nulla.
     * -) e1 restituisce true quando:
     * a) la matrice non è nulla e
     * b) la somma degli elementi di ciascuna riga
     * coincide con la somma degli elementi della
     * colonna corrispondente.
     */

    // public static boolean e1(int[][] matrice) {
    // if (matrice == null) {
    // return false;
    // } else {
    // boolean boo = true;
    // for (int i = 0; i < matrice.length; i++) {
    // int sri = 0;
    // int scol = 0;
    //
    // for (int j = 0; j < matrice[i].length; j++) {
    // sri += matrice[i][j];
    // scol += matrice[j][i];
    // }
    // if (sri != scol) {
    // boo = false;
    // }
    // }
    // return boo;
    // }
    //
    // }

    /*
     * ESERCIZIO 2.
     * Scrivere un metodo ricorsivo dicotomico e2 con
     * le seguenti caratteristiche:
     * -) e2 ha un parametro formale di tipo matrice
     * bidimensionale di interi che puo' essere solo
     * quadrata, o nulla.
     * -) e2 restituisce true quando:
     * a) la matrice non è nulla e
     * b) la somma degli elementi di ciascuna riga
     * coincide con la somma degli elementi della
     * colonna corrispondente.
     * Per il calcolo della somma degli elementi in
     * una riga, definire un metodo ricorsivo sommaR
     * co-variante. Per il calcolo della somma degli
     * elementi in una colonna, definire un metodo
     * ricorsivo sommaC contro-variante.
     */

    public static boolean e2(int[][] matrice) {
        boolean result = (matrice != null);
        if (result) {
            result = matrice.length == 0;
            if (!result) {
                result = e2(matrice, 0, matrice.length - 1);
            }
        }
        return result;
    }

    public static boolean e2(int[][] matrice, int start, int end) { // dicotomica
        if (start == end)
            return sommaR(matrice[start], matrice[start].length - 1) == sommaC(matrice, start, 0);
        else {
            int mid = (start + end) / 2;
            return e2(matrice, start, mid) && e2(matrice, mid + 1, end);
        }
    }

    public static int sommaC(int[][] matrice, int j, int i) { // contro-variante
        if (i == matrice.length)
            return 0;
        else {
            return matrice[i][j] + sommaC(matrice, j, i + 1);
        }
    }

    public static int sommaR(int[] array, int i) { // co-variante
        if (i == 0)
            return array[0];
        else {
            return array[i] + sommaR(array, i - 1);
        }
    }

    public static void Stampa(int[][] matrix) {
        if (matrix == null)
            System.out.println("La matrice è nulla.");
        else {
            for (int i = 0; i < matrix.length; ++i) {
                for (int j = 0; j < matrix[i].length; ++j) {
                    System.out.print("\t" + matrix[i][j]);
                }
                System.out.println();
            }
        }
    }

    /*
     * ESERCIZIO 3.
     * Siano dati:
     * -) il metodo parity, qui sotto definito,
     * da applicare esclusivamente a un parametro
     * attuale con almeno un elemento (a.length>=1)
     * -) il predicato P(i) seguente:
     *
     * "Alla sua uscita, parity(a, i) rende vero
     * 'per ogni k.se 0<= k <= i, \
     * allora a[k]==(k%2==0)' ".
     *
     * 1) Scrivere il predicato P(0).
     * 2) Scrivere il predicato P(i-1) ==> P(i).
     * 3) Dimostrare che P(0) è vero.
     * 4) Dimostrare che P(i-1) ==> P(i) e' vero,
     * ragionando induttivamente.
     * static void parity(boolean[] a, int i) {
     * if (i < a.length) {
     * if (i == 0)
     * a[i] = true;
     * else {
     * parity(a, i - 1); //(A)
     * a[i] = !a[i - 1]; //(B)
     * }
     * }
     * }
     */

    /*
     * ESERCIZIO 4. Disegnare lo stato della
     * memoria immediatamente prima della
     * disallocazione del record di attivazione
     * del metodo stack, quando i ha valore 2.
     * static void stack(int[][] x, int i) {
     * if (i < x.length) {
     * int[] l = new int[x[i].length];
     * l[i] = x[i][i] + 1;
     * x[i] = l;
     * stack(x, i + 1); // (B)
     * }
     * }
     *
     * public static void main(String[] args) {
     * int[][] y = {{0,0}, {0,0}};
     * stack(y, 0); // (A)
     * }
     * }
     */
}
