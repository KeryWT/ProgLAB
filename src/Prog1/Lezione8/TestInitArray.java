package Prog1.Lezione8;

public class TestInitArray {
    public static void main(String[] args) {
        int[] array = MetodiSuArray.initArrayInt();
        MetodiSuArray.stampaArrayInt(array);
        int[] array2 = MetodiSuArray.initArrayInt();

        MetodiSuArray.copiaElementi(array2, array);
        MetodiSuArray.stampaArrayInt(array);

        int[] a2 = MetodiSuArray.clonaArray(array);
        MetodiSuArray.stampaArrayInt(a2);


    }
}
