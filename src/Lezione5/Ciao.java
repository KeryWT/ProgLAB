package Lezione5;

import java.util.Scanner;

public class Ciao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2 = "ciao";
        boolean uguali = true;
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci una stringa: ");
            s1 = sc.next();
            if (!s1.equals(s2)) uguali = false;
        }
        System.out.println(uguali);
    }
}


//    Scrivere un programma Ciao.java che chiede all'utente d'inserire 5 stringhe e alla fine stampi true
//        se sono tutte uguali a "ciao", false altrimenti.

//        • Per verificare se due stringhe s1 e s2 sono uguali si usi il "metodo" equals della classe
//        String: s1.equals(s2)
//        • Per leggere una stringa si usi il metodo readWord() di Sin, oppure il metodo next() della
//        classe Scanner.

//        Questi metodi leggono una parola (sequenza di caratteri diversi dagli spazi)
//        dall'input, e la ritornano come String.