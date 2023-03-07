package Prog1.Lezione6;

public class MetodiNumericiRicorsivi {

    public static void main(String[] Args) {

        System.out.println("Il risultato di " + 4 + "^" + 3 + " e': " + esponenziale(4, 3) + " --> " + (esponenziale(4, 3) == 64));

        System.out.println("Il risultato di " + 5 + "+" + 25 + " e': " + somma(5, 25) + " --> " + (somma(5, 25) == 30));

        System.out.println("Il prodotto dei numeri tra 10 e 20 divisibili per 2 e': " + prodottoMultipli(10, 20, 2) + " --> " + (prodottoMultipli(10, 20, 2) == 10 * 12 * 14 * 16 * 18 * 20));

        System.out.println(stampaInteroAlRovescio(5));
    }

    //Dati una base b e un esponente e (come parametri),
    //restituisce il valore di b^e; Assumere e>=0.
    // Provare a richiamare il metodo nel main.
    public static int esponenziale(int b, int e) {

        if (e == 1) {
            return b;
        } else {
            return b * esponenziale(b, e - 1); // b^(e-1) * b == b^e
        }
    }

    //presi due interi non negativi come parametri calcoli e
    //restituisca la loro somma;
    // Usare solo incrementi di +1 o decrementi di -1 per il calcolo.
    public static int somma(int n1, int n2) {
        // prende 2 numeri interi >= 0
        if (n2 == 0) return n1;
        else {
            return somma(n1 + 1, n2 - 1);
        }

    }

    //presi come parametri tre interi non-negativi n, m e q
    // restituisce il prodotto di tutti gli interi
    // compresi tra n e m che sono multipli di q
    public static int prodottoMultipli(int n, int m, int q) {
        // prendo in input 3 interni >= 0
        if (n > m) return 1; //passo base
        else if (n % q == 0) { // passo induttivo
            return n * prodottoMultipli(n + 1, m, q);
        } else {
            return prodottoMultipli(n + 1, m, q);
        }
    }

    //prenda un intero n>=0 e stampa a video i valori da n a 0;
    public static int stampaInteroAlRovescio(int n) {
        if (n == 0) return 0;
        else {
            System.out.println(n);
            return stampaInteroAlRovescio(n - 1);
        }
    }
}


//    In una classe MetodiNumericiRicorsivi si creino i seguenti metodi ricorsivi,
//    li si provi richiamandoli nel main e con istruzioni di stampa opportune.
//        ● Scrivere un metodo esponenziale che dati una base b e un esponente e (come parametri),
//        restituisce il valore di b^e; Assumere e>=0. Provare a richiamare il metodo nel main.
//        ● Scrivere un metodo somma che presi due interi non negativi come parametri calcoli e
//        restituisca la loro somma; Usare solo incrementi di +1 o decrementi di -1 per il calcolo.
//        ● Scrivere un metodo prodottoMultipli che presi come parametri tre interi non-negativi n, m e
//        q restituisce il prodotto di tutti gli interi compresi tra n e m che sono multipli di q
//        ● Scrivere un metodo stampaInteroAlRovescio che prenda un intero n>=0 e stampa a video i
//        valori da n a 0;