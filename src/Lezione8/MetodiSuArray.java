package Lezione8;

import java.util.Scanner;
// ESERCIZIO 1
/*
Esercizio 1
In una classe MetodiSuArray scrivere i seguenti metodi iterativi:
• int[] initArrayInt() che legge da input un numero intero N>=0 come dimensione di un array,
e successivamente legge altri N valori interi. Ritorna l'array di dimensione N contenente gli
elementi letti. Usare Sin.readInt per leggere l'input.

• void stampaArrayInt(int[] a) che stampa a video gli elementi di a.
Scrivere una classe TestInitArray che inizializza un array con il metodo initArrayInt() e ne stampa il contenuto.
 Provare a eseguire il programma Java in modo interattivo.

Successivamente, creare un file dati.txt contenente:
3 10 15 12
ed eseguire il programma dal terminale comandi come: java TestInitArray < dati.txt
NOTA: il file dati.txt DEVE finire con un ritorno a capo dopo il 12, altrimenti non viene completato l'input.
 */

public class MetodiSuArray {

    public static int[] initArrayInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la dimensione dell'array >= 0: ");
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci il valore da assegnare alla posizione " + i);
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void stampaArrayInt(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    // ESERCIZIO 2
    /*
Esercizio 2
Aggiungere alla classe MetodiSuArray i seguenti metodi iterativi:
• void copiaElementi(int[] from, int[] to) che copia tutti gli elementi dall'array from all'array
to. Il metodo assume che from e to siano inizializzati e abbiano la stessa dimensione.
• int[] clonaArray(int[] a) che ritorna una copia di a opportunamente allocata nello heap.
Utilizzare copiaElementi per effettuare le operazioni di copia. Se a é null, allora ritorna null.
Modificare la classe TestInitArray per clonare l'array inserito. Verificare, tramite opportune operazioni di stampa,
 che l'array clonato contenga gli stessi elementi dell'array iniziale.
 */
    public static void copiaElementi(int[] from, int[] to) {
        for (int i = 0; i < from.length; i++) {
            to[i] = from[i];
        }
    }

    public static int[] clonaArray(int[] a) {
        int[] a2 = new int[a.length];
        if (a == null) return null;
        copiaElementi(a, a2);
        return a2;
    }

    // ESERCIZIO 3
    /*
    Esercizio 3
Aggiungere alla classe MetodiSuArray i seguenti metodi iterativi:
• int[] filtroMinoriDi(int[] a, int limiteSuperiore) che restituisce un nuovo array d'interi
contenente tutti gli elementi di a che sono strettamente minori del valore limiteSuperiore;
     */
    public static int[] filtroMinoriDi(int[] a, int limiteSuperiore) {
        int count = 0;
        int count2 = 0;
        for (int i : a) {
            if (i < limiteSuperiore) count++;
        }
        int[] a3 = new int[count];
        for (int i : a) {
            if (i < limiteSuperiore) {
                a3[count2] = i;
                count2++;
            }
        }
        return a3;
    }

    /*
    • int[] filtroIntervalloDisp(int[] a, int min, int max) che restituisce l'array degli interi copiati
      da a che sono dispari e compresi tra min e max (estremi inclusi);
     */
    public static int[] filtroIntervalloDisp(int[] a, int min, int max) {
        int count = 0;
        int count2 = 0;
        for (int i : a) {
            if (i >= min && i <= max) count++;
        }
        int[] a4 = new int[count];
        for (int i : a) {
            if (i >= min && i <= max) {
                a4[count2] = i;
                count2++;
            }
        }
        return a4;
    }

    /*
    • boolean[] trasduttore(int[] a, int limiteSuperiore) che restituisce un array di booleani, in cui
      ogni elemento sia true se l'elemento di posizione corrispondente in a è inferiore o uguale a
      limiteSuperiore e false altrimenti;
     */
    public static boolean[] trasduttore(int[] a, int limiteSuperiore) {
        int count = 0;
        boolean[] inf = new boolean[a.length];
        for (int i : a) {
            inf[count] = i <= limiteSuperiore;
            count++;
        }
        return inf;
    }

    /*
    • void stampaArrayBoolean(boolean[] a) che stampa a video gli elementi di a (perché non si
      può usare stampaArrayInt?). ---> Perché a è booleano, zio pera-

      Verificare il corretto funzionamento di questi metodi creando una classe TestFiltriArray,
      e sperimentando vari input.
     */

    public static void stampaArrayBoolean(boolean[] a) {
        for (boolean i : a) {
            System.out.print(i + " ");
        }
    }
}

