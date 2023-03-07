package Prog1.Lezione4;

import java.util.Scanner;
public class Quadrato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero > 0: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == i) // Se sono nella diagonale stampo '\'
                    System.out.println("\\");
                else if (j > i) // Se sono sopra la diagonale stampo '\'
                     System.out.println(':');
                else // Se sono sotto la diagonale stampo '*'
                    System.out.println('*');

            }
            System.out.println();
        }

    }

}


//Esercizio 6
//        Scrivere un programma Prog1.Lezione4.Quadrato.java che legge in input un numero N e stampa a video un quadrato di N*N
//        caratteri tra '*', '\' e ':' seguendo questo pattern (esempio per N=6):
//        \:::::
//        *\::::
//        **\:::
//        ***\::
//        ****\:
//        *****\
//        Suggerimento: si ricorda che System.out.print() non va a capo, a differenza di System.out.println().
//        Suggerimento: fare due cicli annidati, uno esterno per le righe,
//        e uno o più cicli interni per i caratteri sulla stessa una riga.
