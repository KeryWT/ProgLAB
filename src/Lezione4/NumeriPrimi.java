package Lezione4;

public class NumeriPrimi {
    public static boolean verificaPrimalita(int num) {
        for (int div = 2; div < num; div++) {
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Stampare i primi 100 numeri primi

        int num = 2, count = 0;

        while (count < 100) {
            if (verificaPrimalita(num)) {
                System.out.print(num + ", ");
                ++count;
            }
            num++;
        }
    }
}

//    Scrivere un programma NumeriPrimi.java che implementa un metodo verificaPrimalita
//    che deve prendere come argomento un numero intero e ritornare un valore appropriato per indicare se è primo
//    (Qual è il tipo appropriato da ritornare?).
//    Usare il metodo per trovare e stampare i primi 100 numeri primi.