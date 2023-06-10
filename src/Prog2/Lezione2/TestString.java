package Prog2.Lezione2;

public class TestString {

    // ritorna la stringa piu' lunga in un array di stringhe
    public static String longest(String[] s) {
        assert s!= null: "La stringa è nulla";
        assert s.length != 0: "La stringa è vuota";

        for (int i = 0; i < s.length; i++) {
        assert s[i] != null: "i valori della stringa s[] devono essere diversi da null";
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < s.length; i++){
            if (s[i].length() >= max){
                index = i;
                max = s[i].length();
            }
        }
        return s[index];
    }

    // ritorna la concatenazione di tutte le stringhe nell'array s
    public static String concatAll(String[] s) {
        return ""; // DA IMPLEMENTARE
    }

    // elimina gli spazi iniziali e finali della stringa @s
    public static String trim(String s) {
        return ""; // DA IMPLEMENTARE
    }

    // testa i tre metodi utilizzando gli argomenti passati a java sulla riga di comando
    public static void main(String[] args) {
        System.out.println("longest =       |" + longest(args) + "|");
//        System.out.println("concatAll =     |" + concatAll(args) + "|");
//        assert args.length > 0;
//        System.out.println("trim(args[0]) = |" + trim(args[0]) + "|");
    }

    // testa i tre metodi
//    public static void main(String[] args) {
//        String[] a = {" corto  ", "il più lungo", "cattivo"};
//
//        String pl = longest(a);
//        if (pl != a[1]) System.out.println("longest (SBAGLIATO) =     |" + pl + "|");

//        String ca = concatAll(a);
//        if (!(ca.equals(a[0]+a[1]+a[2]))) System.out.println("concatAll (SBAGLIATO) =     |" + ca + "|");
//
//        assert a.length > 0;
//        String tr = trim(a[0]);
//        if (!(tr.equals("corto"))) System.out.println("trim (SBAGLIATO) =     |" + tr + "|");
//    }
}