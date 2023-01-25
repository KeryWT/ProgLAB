package EserciziEsame;

//import java.util.Scanner;


public class Simulazione {
    public static void main(String[] args) {
//        int maxr = 3;
//        int maxc = 3;

        int[][] matrice = {{3,3,3},{3,5,6},{3,8,9}};
//        for (int i = 0; i < maxr; i++) {
//            for (int j = 0; j < maxc; j++) {
//                matrice[i][j] = 1;
//            }
//        }
        System.out.println(e1(matrice));
    }

    /* ESERCIZIO 1.
     * Scrivere un metodo iterativo e1 con le seguenti
     * caratteristiche:
     * -) e1 ha un parametro formale di tipo matrice
     * bidimensionale di interi che puo' essere solo
     * quadrata, o nulla.
     * -) e1 restituisce true quando:
     *    a) la matrice non è nulla e
     *    b) la somma degli elementi di ciascuna riga
     *    coincide con la somma degli elementi della
     *    colonna corrispondente. */

    public static boolean e1(int[][] matrice) {
        if (matrice == null) {
            return false;
        } else {
            boolean boo = true;
            for (int i = 0; i < matrice.length; i++) {
                int sri = 0;
                int scol = 0;

                for (int j = 0; j < matrice[i].length; j++) {
                    sri += matrice[i][j];
                    scol += matrice[j][i];
                }
                if (sri != scol) {
                    boo = false;
                }
            }
            return boo;
        }

    }
}

/* ESERCIZIO 2.
 * Scrivere un metodo ricorsivo dicotomico e2 con
 * le seguenti caratteristiche:
 * -) e2 ha un parametro formale di tipo matrice
 * bidimensionale di interi che puo' essere solo
 * quadrata, o nulla.
 * -) e2 restituisce true quando:
 *    a) la matrice non è nulla e
 *    b) la somma degli elementi di ciascuna riga
 *    coincide con la somma degli elementi della
 *    colonna corrispondente.
 * Per il calcolo della somma degli elementi in
 * una riga, definire un metodo ricorsivo sommaR
 * co-variante. Per il calcolo della somma degli
 * elementi in una colonna, definire un metodo
 * ricorsivo sommaC contro-variante.           */

//public static boolean e2(matrice[][]){
//
//}

	/* ESERCIZIO 3.
     * Siano dati:
     * -) il metodo parity, qui sotto definito,
     * da applicare esclusivamente ad un parametro
     * attuale con almeno un elemento (a.length>=1)
     * -) il predicato P(i) seguente:
     *
     *  "Alla sua uscita, parity(a,i) rende vero
     *    'per ogni k.se 0<= k <= i, \
     *                allora a[k]==(k%2==0)' ".
     *
     * 1) Scrivere il predicato P(0).
     * 2) Scrivere il predicato P(i-1) ==> P(i).
     * 3) Dimostrare che P(0) e' vero.
     * 4) Dimostrare che P(i-1) ==> P(i) e' vero,
     * ragionando induttivamente.
	static void parity(boolean[] a, int i) {
		if (i < a.length) {
			if (i == 0)
				a[i] = true;
			else {
				parity(a, i - 1); //(A)
				a[i] = !a[i - 1]; //(B)
			}
		}
	}
*/

	/* ESERCIZIO 4. Disegnare lo stato della
	 * memoria immediatamente prima della
	 * disallocazione del record di attivazione
	 * del metodo stack, quando i ha valore 2.
	static void stack(int[][] x, int i) {
		if (i < x.length) {
			int[] l = new int[x[i].length];
			l[i] = x[i][i] + 1;
			x[i] = l;
			stack(x, i + 1); // (B)
		}
	}

	public static void main(String[] args) {
		int[][] y = {{0,0}, {0,0}};
		stack(y, 0); // (A)
	}
}
*/