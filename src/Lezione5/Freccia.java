package Lezione5;

import java.util.Scanner;

public class Freccia {
    public static void stampaRiga(int nPunti, int nAsterischi){
        while (nPunti-- > 0) System.out.print(".");
        while (nAsterischi-- > 0) System.out.print("*");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero N: ");
        final int N = sc.nextInt();

        for (int i = 0; i < N; i++) stampaRiga(i,2);
        for (int i = N - 2; i >= 0; i--) stampaRiga(i,2);
    }
}

//    Scrivere un programma Freccia.java
//    che legge in input un numero N e stampa a video (2*N-1) righe secondo il seguente pattern
//    (esempio per N=5):
//        **
//        .**
//        ..**
//        ...**
//        ....**
//        ...**
//        ..**
//        .**
//        **
//       Per fare la stampa, definire e implementare un metodo stampaRiga
//       che prende in input due numeri interi nPunti e nAsterischi,
//       e stampa a video in fila una sequenza di'.'e'*' pari al numero indicato.
