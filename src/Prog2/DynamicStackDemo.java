package Prog2;

//DynamicStackDemo.java (prova della classe DynamicStack)
public class DynamicStackDemo{
    public static void main(String[] args){
        System.out.println( "Stampo la pila P={11,9,7,5,3}");
        DynamicStack P = new DynamicStack();
        P.push(3);P.push(5);P.push(7);P.push(9);P.push(11);
        System.out.println(P);
        System.out.println(
                "Estraggo gli ultimi 3 elementi inseriti: 11, 9, 7. Leggo 5");
        System.out.println(P.pop());
        System.out.println(P.pop());
        System.out.println(P.pop());
        //Leggiamo il prossimo elemento, 5, senza estrarlo dalla pila
        System.out.println(P.top());
        System.out.println( "Stampo cosa resta: P={5,3}" );
        System.out.println(P);
        System.out.println("Stampo la pila Q={1,2,3,4,5,6,7,8,9,10}");
        DynamicStack Q = new DynamicStack(10);
        System.out.println(Q);
    }
}
