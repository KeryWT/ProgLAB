package Lezione4;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una N>=2: "); // Per semplicità assumere che N>=2
        int N = sc.nextInt();
        int temp;
        for (int i = 0; i < N; i++){
            int n = 0;
            int m = 1;
            System.out.print(n + " " + m);
            temp = n + m;
            n = m;
            m = temp;
            System.out.print(" " + n);
        }
    }
}



//Esercizio 7
//        Scrivere un programma Lezione4.Fibonacci.java che legge in input un numero N e stampa a video i primi N
//        numeri della successione di Lezione4.Fibonacci. Ad, esempio, per N=10, l'output atteso è:
//        0 1 1 2 3 5 8 13 21 34
//        Per semplicità assumere che N>=2.
//        Si ricorda che la successione di Lezione4.Fibonacci parte da due numeri 0 e 1, e ogni elemento successivo
//        della successione è ottenuto come somma dei due elementi precedenti.
//        Suggerimento: partite da due numeri n=0 ed m=1 e stampateli. Poi a ogni iterazione aggiornali in
//        modo che:
//        n' = m, m' = n + m
//        e stampare m'.
//        Domanda: Per fare questo aggiornamento serve una variabile temporanea?