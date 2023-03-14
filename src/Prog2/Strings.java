package Prog2;

public class Strings {
    public static String longest(String[] lines) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < lines.length; i++) {
            if (lines[i].length() > max) {
                max = lines[i].length();
                index = i;
            }
        }
        return lines[index];
    }

    public static String concatAll(String[] lines) {
        String conc = "";
        for (String s : lines) {
            conc = conc.concat(s);
        }
        return conc;
    }

    public static String trim(String s) {
        assert s != null && !s.equals("") : "String is either null or empty";

        while (!s.equals("") && (s.charAt(0) == ' ' || s.charAt(s.length() - 1) == ' ')){

            if (s.equals(" ")) {
                s = "";
            } else {

                if (s.charAt(0) == ' ') {
                    s = s.substring(1);
                }
                if (s.charAt(s.length() - 1) == ' ') {
                    s = s.substring(0, s.length() - 1);
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Strings.trim("uanm   "));
        System.out.println(Strings.trim("        "));
        System.out.println(Strings.trim(""));
        System.out.println(Strings.concatAll(new String[]{"voglio", "andare"}));
        System.out.println(Strings.longest(new String[]{"stringalunghissimapropriolei", "stringacortinaciao"}));

    }
}
