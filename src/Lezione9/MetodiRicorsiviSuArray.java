package Lezione9;

public class MetodiRicorsiviSuArray {
public static boolean tuttiPari(int[] a) {
    return tuttiPariRic(a, a.length - 1);
}

public static boolean tuttiPariRic(int[] a, int i ){
    if (i == 0){
        return (a[i]%2==0);
    } else {
        return (a[i]%2==0 && tuttiPariRic(a, i - 1));
    }
}

    public static void main(String[] args) {
        int[] a = {2,4,6,8};
        System.out.println(tuttiPari(a));
}
}

