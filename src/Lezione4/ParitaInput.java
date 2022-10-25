package Lezione4;

import java.util.Scanner;

public class ParitaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        boolean proceed = true;
        boolean pari = false;
        boolean dispari = false;

        while (proceed) {
            System.out.print("Inserisci un numero: ");
            n = input.nextInt();
            if (n != 0) {
                if (n % 2 == 0){
                    pari = true;
                } else {
                    dispari = true;
                }
            } else {
                proceed = false;
            }
        }
        if (dispari && !pari){
            System.out.println("Tutti i numeri inseriti sono dispari");
        } else if (!dispari && pari) {
            System.out.println("Tutti i numeri inseriti sono pari");
        } else {
            System.out.println("Ci sono sia numeri pari che dispari");
        }
    }
}


//    Scrivere un programma Lezione4.ParitaInput.java che legge una sequenza di interi letti da stdin (terminati
//        da uno 0 che viene escluso dalla sequenza) e alla fine della sequenza stampa:
//        • "Tutti i numeri inseriti sono dispari" se tutti i numeri inseriti sono dispari.
//        • "Tutti i numeri inseriti sono pari" se tutti i numeri inseriti sono pari.
//        • "Ci sono sia numeri pari che dispari" se compaiono sia numeri pari e dispari nella sequenza
//        • "Non hai inserito numeri" se la sequenza di numeri è vuota.
//        Verificare il programma con i seguenti input (per testare tutta la casistica):
//        • 2 4 6 0
//        • 9 3 7 5 0
//        • 1 2 3 4 0