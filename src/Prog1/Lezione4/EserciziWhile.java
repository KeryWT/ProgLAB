package Prog1.Lezione4;

import java.util.Scanner;

public class EserciziWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quante volte vuoi far girare il programma?");
        int n = input.nextInt();

        System.out.println("Stampiamo a video gli interi da 0 a n");
        // Stampiamo a video gli interi da 0 a n
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("Stampiamo a video gli interi da n a 0");
        // Stampiamo a video gli interi da n a 0
        System.out.println();
        int j = n;
        while (j >= 0) {
            System.out.println(j);
            j--;
        }

        System.out.println("Stampiamo a video i numeri interi dispari da 0 a n");

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Stampiamo il fattoriale di n");
        int i = 1;
        int F = n;
        while (i < n) {
            F = F * i;
            i++;
        }

        // for(int i=1; i < n; i++) {
        // F = F * i;
        // }

        System.out.println("Il fattoriale di " + n + " e' " + F);
        //Fattoriale di 5 = 5 * 4 * 3 * 2 * 1 = 120
    }
}

//    Creare una classe Prog1.Lezione4.EserciziWhile.java che contenga un main in cui:
//        1. Dato un intero n letto da input, si stampino a video tutti gli interi da 0 a n e poi da n a 0. Si
//        usino sia il while che il for
//        2. Successivamente si stampino a video tutti gli interi dispari da 0 a n
//        3. Infine si stampi a video il fattoriale di n. Per trovare il valore si usi prima il while e poi il
//        for. Si ricorda che il fattoriale di n è pari a: 1 * 2 * ... * (n-1) * n.