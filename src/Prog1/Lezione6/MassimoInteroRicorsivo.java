package Prog1.Lezione6;

import java.util.Scanner;

public class MassimoInteroRicorsivo {
    public static void main(String[] args) {
        System.out.println("Il massimo numero inserito è: " + MassimoInteroRicorsivoMetodo());
    }

    public static int MassimoInteroRicorsivoMetodo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero > 0: (Con 0 termini la sequenza)");
        int n = sc.nextInt();
        if (n == 0) return 0;
        else {
            int n2 = MassimoInteroRicorsivoMetodo();
            return Math.max(n, n2);
        }
    }
}


//Scrivere una classe MassimoInteroRicorsivo
// che implementa lo stesso metodo dell’Esercizio 2 in forma ricorsiva.

/*In una classe MassimoIntero scrivere un programma che legge da tastiera
 una sequenza di numeri strettamente maggiori di 0, terminata dal numero 0.
  Quando la sequenza viene terminata, il programma deve stampare il massimo numero intero inserito.


--Esercizio 2 svolto NON ricorsivamente--
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
        while (num > 0) {
            System.out.println("Inserisci un numero: (con 0 termini la sequenza)");
            num = sc.nextInt();
            if (num > max) max = num;
        }
        System.out.println("Il numero piu' grande e': " + max);
    }
}
*/
