package Lezione6;
// ESERCIZIO 9
import java.util.Scanner;

public class ControllaStringa {
    public static boolean tutteCifre(String s) {
        return tutteCifreRic(s, s.length() - 1);
    }

    public static boolean tutteCifreRic(String s, int i) {
        if (i < 0) return true; // passo base
        return '0' <= s.charAt(i) && s.charAt(i) <= '9' && tutteCifreRic(s, i - 1); // passo induttivo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la tua stringa: ");
        String s = sc.nextLine();

        if (tutteCifre(s)) System.out.println("Sono tutte cifre.");
        else System.out.println("Non sono tutte cifre.");
    }
}



/*
Esercizio 9
In una classe ControllaStringa scrivere un metodo ricorsivo booleano tutteCifre che prende in
ingresso una Stringa e ritorna true se tutti i caratteri sono cifre (da ‘0’ a ‘9’).
NOTA: quali argomenti sono necessari al metodo? A stringa o frat

SUGGERIMENTO: scrivere un metodo di appoggio tutteCifreRic che prenda un argomento
aggiuntivo (per quale motivo? Cosa rappresenta?). Un indice per il carattere che viene controllato
 */