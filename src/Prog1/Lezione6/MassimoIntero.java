package Prog1.Lezione6;

import java.util.Scanner;

public class MassimoIntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int num;

        do{
            System.out.println("Inserisci un numero: (con 0 termini la sequenza)");
            num = sc.nextInt();
            if (num > max) max = num;
        } while (num > 0);

        // metodo alternativo
//        while (num > 0) {
//            System.out.println("Inserisci un numero: (con 0 termini la sequenza)");
//            num = sc.nextInt();
//            if (num > max) max = num;
//        }
        System.out.println("Il numero piu' grande e': " + max);
    }
}


//In una classe MassimoIntero scrivere un programma che legge da tastiera una sequenza di numeri strettamente maggiori di 0,
// terminata dal numero 0.
// Quando la sequenza viene terminata, il programma deve stampare il massimo numero intero inserito.