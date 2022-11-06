package Lezione5;

public class Asterischi {
    public static void rettangoloAsterischi(int altezza, int larghezza) {
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < larghezza; j++) System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rettangoloAsterischi(5, 3);
        System.out.println();
        rettangoloAsterischi(12, 4);
        System.out.println();
        rettangoloAsterischi(8, 2);
        System.out.println();
        rettangoloAsterischi(3, 3);
    }
}


//    Scrivere un programma Asterischi.java che implementa:
//        • un metodo rettangoloAsterischi che prende in input due argomenti altezza e larghezza e
//        disegni a video un rettangolo di caratteri '*' delle dimensioni indicate
//        • nel main chiamare il metodo per stampare, in sequenza, rettangoli con le seguenti
//        dimensioni:

//        ◦ lunghezza 5, altezza 3;
//        ◦ lunghezza 12, altezza 4;
//        ◦ lunghezza 8, altezza 2;
//        ◦ lunghezza 3, altezza 3;
