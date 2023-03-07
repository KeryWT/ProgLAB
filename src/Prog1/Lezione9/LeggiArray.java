package Prog1.Lezione9;

import java.util.Scanner;

public class LeggiArray {
    // Metodo WRAPPER
    static int[] leggiArrayInt() {
        return leggiArrayRic(0);
    }


    // Ricorsione contro-variante su i
    static int[] leggiArrayRic(int i) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int n = sc.nextInt();
        if (n == 0) { // Caso Base
            return new int[i];
        } else { // Passo Ricorsivo
            int[] arr = leggiArrayRic(i + 1);
            arr[i] = n;
            return arr;
        }
    }

    static void stampaArrayInt(int[] arr) {
        stampaArrayIntRic(arr, 0);
    }

    static void stampaArrayIntRic(int[] arr, int i) {
        if (i < arr.length) {
            System.out.println(arr[i]);
            stampaArrayIntRic(arr, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = leggiArrayInt();
//        for (int i : arr) System.out.print(i + " ");
        stampaArrayInt(arr);
    }
}
