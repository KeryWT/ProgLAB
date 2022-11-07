package Lezione6;

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
