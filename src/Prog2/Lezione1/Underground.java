package Prog2.Lezione1;

public class Underground {
    private String matricola = "";
    private int linea = 1;
    private int stazione = 0;

    //metodi get e set
    public String getMatricola() {
        return matricola;
    }

    public int getLinea() {
        return linea;
    }

    public int getStazione() {
        return stazione;
    }

    public void setMatricola(String x) {
        matricola = x;
    }

    public void setLinea(int x) {
        linea = x;
    }

    public void setStazione(int x) {
        stazione = x;
    }

    public int updateNextStation() {
        if (stazione == 9) {
            stazione = 0;
        } else this.stazione++;
        return stazione;
    }

    public int nextStation() {
        return getStazione() + 1;
    }

    public static void main(String[] args) {
        Underground t1 = new Underground();
        Underground t2 = new Underground();
        t1.setMatricola("aaa");
        t1.setLinea(1);
        t1.setStazione(8);
        t2.setMatricola("bbb");
        t2.setLinea(1);
        t2.setStazione(5);

        for (int ix = 0; ix < 2; ix++) {
            int t1PrxSt = t1.updateNextStation();
            System.out.println("t1: " + t1PrxSt);
            int t2PrxSt = t2.updateNextStation();
            System.out.println("t2: " + t2PrxSt);
        }
    }
}

