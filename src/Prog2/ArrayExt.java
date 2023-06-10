package Prog2;
//Questa classe definisce array estendibili con dimensioni
//un valore min deciso inizialmente, oppure il doppio, il quadruplo
//eccetera, a seconda di quanto spazio viene richiesto.

public class ArrayExt{
    // Invariante: (0 <= size <= lunghezza vett) e (lunghezza vett>0)
    // (parte significativa di vett: da 0 a size-1)
    private int size;
    //indica la parte effettivamente in uso del array, 0 all’inizio
    private int[] vett;
    public int getSize(){return size;}

    /** Se min>0, questo metodo costruisce un array di min elementi
     con size=0. La lunghezza di vett sara' min*(una potenza di 2).
     */
    public ArrayExt(int min){
        assert min>0 : "min non positivo = " + min;
        size=0;
        vett=new int[min];
    }

    public String toString(){
        String s = " size = " + size;
        for(int i=0;i<size;++i) s=s+"\n vett["+i+"]="+vett[i];
        return s;
    }

    //Metodo di lettura dell'elemento i con 0<=i<size
    public int get(int i){
        assert 0<=i && i<size: "get su indice non in 0,...,size-1 " + i;
        return vett[i];
    }

    //Metodo di scrittura dell'elemento i con 0<=i<size
    public void set(int i, int x){
        assert 0<=i && i<size: "set su indice non in 0,...,size-1 " + i;
        vett[i]=x;
    }

    //Metodo per espandere l’array quando necessario
    private void extend(){
        int[] vett1 = new int[vett.length*2];
        //nuovo array di lunghezza doppia
        for(int i=0;i<size;++i)
        {vett1[i]=vett[i];} //trascrivo il vecchio array nel nuovo
        vett=vett1; //aggiorno l'indirizzo dell’array “ufficiale”
        assert 0<=size && size<=vett.length;
    }

    //Metodo per aggiungere un elemento x nel posto 0<=i<=size, spostando
//di una posizione gli elementi a destra di i. Puo' fare da push.
    public void add(int i, int x){
        assert 0<=i && i<=size: "add su indice non in 0,...,size " + i;
        if (size==vett.length)  //se manca lo spazio
            extend(); //espando l’array
        assert size<vett.length; //controllo che ora lo spazio ci sia
        for(int j=size-1;j>=i;--j) {vett[j+1]=vett[j];}
        //sposto avanti di una posizione gli elementi a destra di i
        //eseguo le assegnazioni nell’ordine da destra a sinistra
        vett[i]=x; //nello spazio cosi' creato aggiungo x
        ++size; //aggiorno il numero degli elementi
        assert 0<=size && size<=vett.length; //controllo l’invariante
    }

    //Rimozione della posizione 0<=i<size effettivamente nell’array.
    //restituisce l'elemento rimosso e quindi puo' fare da "pop"
    public int remove(int i){
        assert 0<=i && i<size : "set su indice non in 0,...,size-1 " + i;
        --size; //aggiorno la dimensione
        int x = vett[i]; //salvo vett[i] in x prima di cancellarlo
        for(int j=i;j<=size-1;++j) {vett[j]=vett[j+1];}
        //sposto gli elementi a destra di i indietro di uno;
        //eseguo le assegnazioni nell’ordine da sinistra a destra
        return x;
    }
}