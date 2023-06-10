package Prog2;
public class ArrayExtDemo{
    public static void main(String[] args){
        ArrayExt a = new ArrayExt(10); //capienza iniziale 10
        //Per controllare il metodo extend() aggiungo 12 elementi.
        System.out.println("aggiungo i valori x=0,1,...,11 sempre in prima posizione, ognuno davanti ai valori precedenti");
        System.out.println
                ("ogni aggiunta sposta avanti di uno gli elementi precedenti");
        int x=0;
        while (x<12) {a.add(0,x);++x;}
        System.out.println(a);
        System.out.println
                ("Rimuovo a[0]=11 e sposto indietro di uno gli altri elementi");
        System.out.println( " a.remove(0)=" + a.remove(0));
        System.out.println(a);
        System.out.println( "Aggiungo x=-1 in posizione 11 (in fondo)");
        a.add(11,-1);
        System.out.println(a);
    }
}