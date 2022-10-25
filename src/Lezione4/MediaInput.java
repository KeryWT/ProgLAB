package Lezione4;

import java.util.Scanner;

public class MediaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int somma = 0;
        int count = 0;
        boolean proceed = true;
        int ingresso;

        while (proceed) {
            System.out.print("Inserisci un numero: ");
            ingresso = input.nextInt();
            if (ingresso != 0) {
                somma += ingresso;
                count++;
            } else {
                proceed = false;
            }
        }
        if (somma == 0) {
            System.out.println("Coglione, se non metti numeri ti esce 0");
        } else {
            System.out.println("La media dei numeri inseriti e' " + (somma / count));
        }
    }
}


//    Scrivere un programma Lezione4.MediaInput.java che:
//        1. Legge da stdin una sequenza di interi positivi terminata da 0
//        2. Quando l'utente inserisce il numero 0, il programma interrompe la lettura degli input,
//        stampa la media (come int) su stdout e termina
//        3. Lo 0 finale non fa parte della sequenza di interi su cui si calcola la media.
//        Verificare il programma con i seguenti input:
//        • 4 8 10 2 0
//        • 3 5 0
//        • 0