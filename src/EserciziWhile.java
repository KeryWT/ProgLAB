import java.util.Scanner;

public class EserciziWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quante volte vuoi far girare il programma?");
        int n = input.nextInt();
        int i = 0;

        // print the values from 0 to n and then from n to 0
        while (i <= n) {
            System.out.println(i);
            i = i + 1;
        }
        while (i >= 0) {
            i = i - 1;
            System.out.println(i);

        }

    }
}
