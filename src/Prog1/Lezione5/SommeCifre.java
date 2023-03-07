package Prog1.Lezione5;

import java.util.Scanner;
public class SommeCifre {
    public static int numeroNcifre(int n) {
        int num = n;
        for (int i = 1; i < n; i++)
            num = (num * 10) + n;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int somma = 0;
        if (n >= 1 && n <= 9) {
            for (int i = 1; i <= n; i++) {
                int num = numeroNcifre(n);
                somma = somma + num;
                System.out.print((i == 1 ? "" : " + ") + num);
            }
            System.out.println(" = " + somma);
        } else System.out.println("Scemo cretino");
    }
}

//Esercizio 11 (opzionale)
//        Scrivere un programma SommeCifre.java che legge in input un numero N compreso tra 1 e 9, e
//        calcola la somma di N numeri:
//        1 + 22 + 333 + 4444 + 55555 + ... = ......
//        Stampare un messaggio di errore se N non è compreso tra 1 e 9.
//        Suggerimento: scrivere un metodo numeroNcifre che prende in input un argomento n e ritorna il
//        numero intero ottenuto da n volte la cifra n. Per ottenere tale numero, usare un ciclo che moltiplica
//        per 10 e somma n