import java.util.Scanner;

public class MinMax10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int n;
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci un numero: ");
            n = sc.nextInt();
            if (i == 0) {
                min = n;
                max = n;
            } else if (n > max) {
                max = n;
            } else if (n < min) {
                min = n;
            }
        }
        System.out.println("La differenza tra massimo e minimo e' " + (max - min));
    }
}


//        Esercizio 8
//        Scrivere un programma MinMax10.java che chiede all'utente 10 interi e successivamente stampa a
//        video la differenza tra il minimo e il massimo.
//        • Si usi un ciclo for chiedendo a ogni iterazione d'inserire un intero.
//        • Si usino variabili opportune per il minimo e per il massimo, inizializzate usando
//        Integer.MAX_VALUE e Integer.MIN_VALUE