package Lezione6;
// ESERCIZIO 8
public class PitagoraRicorsivo {

    public static void pitagoraRicorsivo(){
        stampaRiga(1);
    }

    public static void stampaRiga(int riga){
        if (riga > 10) return;
        stampaElemento(riga, 1 );
        stampaRiga(riga + 1);
    }

    public static void stampaElemento(int riga, int colonna){
        if (colonna > 10){
            System.out.println();
            return;
        } else {
            System.out.format("%4d", riga * colonna);
            stampaElemento(riga, colonna + 1);
        }
    }

    public static void main(String[] args){
        pitagoraRicorsivo();
    }
}



/*  Scrivere una classe PitagoraRicorsivo che implementa
    lo stesso metodo dell’Esercizio 4 in forma ricorsiva.


public class Pitagora {
    public Pitagora() {
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 10; ++i) {
            for (int j = 1; j <= 10; ++j) {
                int val = i * j;
                if (val < 10) {
                    System.out.print("" + val + "   ");
                } else if (val <= 100) {
                    System.out.print("" + val + "  ");
                }
            }
            System.out.println();
        }
    }
}

In una classe Pitagora scrivere un metodo tavolaPitagorica che stampa a video la tavola pitagorica
con 10 righe e 10 colonne. Stamparla in modo che le colonne siano indentate (come fare?)
Output atteso:
    j
  i 1 2 3 4 5 6 7 8 9 10
    2 4 6 8 10 12 14 16 18 20
    3 6 9 12 15 18 21 24 27 30
    4 8 12 16 20 24 28 32 36 40
    5 10 15 20 25 30 35 40 45 50
    6 12 18 24 30 36 42 48 54 60
    7 14 21 28 35 42 49 56 63 70
    8 16 24 32 40 48 56 64 72 80
    9 18 27 36 45 54 63 72 81 90
    10 20 30 40 50 60 70 80 90 100
Richiamate il metodo tavolaPitagorica nel main.
 */