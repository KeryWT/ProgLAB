package Prog1.Lezione6;

import java.io.PrintStream;

public class Metodi {
    public Metodi() {
    }

    public static boolean palindroma(String s) {
        boolean pal = true;

        for (int i = 0; i < s.length() && pal; ++i) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                pal = false;
            }
        }

        return pal;
    }

    public static boolean elementiComuni(String s1, String s2) {
        boolean noElementiComuni = false;

        for (int i = 0; i < s2.length() && !noElementiComuni; ++i) {
            for (int p = 0; p < s1.length() && !noElementiComuni; ++p) {
                if (s1.charAt(p) == s2.charAt(i)) {
                    noElementiComuni = true;
                }
            }
        }

        return noElementiComuni;
    }

    public static void main(String[] args) {
        String str = "UwU";
        System.out.println("La stringa e' palindroma. " + palindroma(str));
        String str2 = "Miao";
        PrintStream var10000 = System.out;
        boolean var10001 = elementiComuni(str, str2);
        var10000.println("Ci sono elementi comuni. " + var10001);
    }
}
