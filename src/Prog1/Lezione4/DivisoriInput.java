package Prog1.Lezione4;

import java.util.Scanner;

public class DivisoriInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di cui vuoi conoscere i divisori: ");

        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.println( i + " e' divisore di " + n);
            }
        }
    }
}


//    Scrivere un programma Prog1.Lezione4.DivisoriInput.java che legge un intero da stdin e scrive su stdout tutti i
//    suoi divisori.