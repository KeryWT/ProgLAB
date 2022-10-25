package Lezione4;

import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero: ");
        int n = sc.nextInt();
        int h = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(h++ + " ");
            }
            System.out.println();
        }


    }
}


//Esercizio 5
//  Scrivere un programma Lezione4.Floyd.java che legge in input un numero N e stampa le prime N righe del triangolo di Lezione4.Floyd. Il triangolo di Lezione4.Floyd è costituito dai numeri naturali scritti in modo consecutivo, per riempire le righe con 1,2,3,... valori. Ad esempio per N=5 l'output deve essere:
//        1
//        2   3
//        4   5   6
//        7   8   9   10
//        11  12  13  14 15
