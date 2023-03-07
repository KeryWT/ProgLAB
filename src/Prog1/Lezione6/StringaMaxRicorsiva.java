package Prog1.Lezione6;
import java.util.Scanner;


public class StringaMaxRicorsiva {
    public static void main(String[] args) {
        System.out.println("La stringa piu' lunga e': " + StringaMaxRicorsivaMetodo());
    }

    public static String StringaMaxRicorsivaMetodo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la tua stringa di testo (La stringa vuota termina il programma): ");
        String string = sc.nextLine();
        if (string.length() == 0) return "";
        else {
            String string2 = StringaMaxRicorsivaMetodo();
            return  (string.length() > string2.length()) ? string : string2;
        }
    }
}


/* Scrivere una classe StringaMaxRicorsiva che implementa
lo stesso metodo dell’Esercizio 3 in forma ricorsiva.

In una classe StringaMax scrivere un programma che legge da tastiera
una sequenza di stringhe di lunghezza maggiore di 0,
terminata dalla stringa vuota (cioè di lunghezza 0).
Quando la sequenza viene terminata, il programma deve stampare
la stringa più lunga inserita fino a quel momento.

-----------------------------------------------------------------------

import java.util.Scanner;
public class StringaMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stringa;
        String max = "";
        do {
            System.out.println("Inserisci una stringa: \n (con una stringa vuota termini la sequenza)");
            stringa = sc.nextLine();
            if (stringa.length() > max.length()) max = stringa;
        } while (stringa.length() > 0);
        System.out.println("La stringa piu' lunga e': " + max);
    }
}
*/