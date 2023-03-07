package Prog1.Lezione8;

public class TestFiltriArray {
    /*    Verificare il corretto funzionamento di questi metodi creando una classe TestFiltriArray,
        e sperimentando vari input.
    */
    public static void main(String[] args) {
        int[] array = MetodiSuArray.initArrayInt(); // faccio inizializzare un array con dati in input
        MetodiSuArray.stampaArrayInt(array); // stampo array appena inserito

        int[] test = MetodiSuArray.filtroMinoriDi(array, 5); // test filtro minori di 5
        MetodiSuArray.stampaArrayInt(test); // stampo array filtrato < 5

        int[] test2 = MetodiSuArray.filtroIntervalloDisp(array, 2, 20); // test filtro intervallo 2-20
        MetodiSuArray.stampaArrayInt(test2); // stampa array filtrato intervallo 2-20

        boolean[] testboolean = MetodiSuArray.trasduttore(array, 5); // test di a[] <= 5
        MetodiSuArray.stampaArrayBoolean(testboolean); // stampa array boolean con elemento <= 5 (test del metodo stampaArrayBoolean
    }
}
