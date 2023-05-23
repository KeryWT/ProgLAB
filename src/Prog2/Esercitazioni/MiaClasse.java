package Prog2.Esercitazioni;

//
//
// https://cscircles.cemc.uwaterloo.ca//java_visualize/#mode=display
//
//
public class MiaClasse {
    // variabile static
    public static int varDiClasse = 55;

    // variabile d'istanza
    public int varDiIstanza;
    private String myPrivateStringField;

    public void setVarDiIstanza(int v) {
        varDiIstanza = v;
    }


    public void setMyPrivateVar(String myStringVar) {
//    //    abilitare le asserzioni con java -ea NomeClasse
//    assert !myStringVar.isEmpty():
//            "ATTENZIONE: l'argomento di setMyPrivateStringVar è una stringa vuota!!!";
        this.myPrivateStringField = myStringVar; // pratica di nominazione migliorabile!!!
    }

    public String getMyPrivateVar(String myString) {
        return this.myPrivateStringField;
    }

    int elaboraValoreVarDiIstanza(int times) {
        return this.varDiIstanza * times;
    }

    // attenzione a questo metodo: stiamo sovrascrivendo quello di Object?
    public String toString(String nomeIstanza, int mioNum) {
        return  "\n " +
                "varDiClasse:          " + varDiClasse + ";\n " +
                "nomeIstanza:          " + nomeIstanza + ";\n "+
                "varDiIstanza:         " + varDiIstanza + ";\n "+
                "myPrivateStringField: " + myPrivateStringField;
    }

    public static void main(String[] args) {
        MiaClasse.varDiClasse = 12; // stiamo sovrascrivendo un valore già presente

        MiaClasse istanza1 = new MiaClasse();
        istanza1.varDiIstanza = 876; // accesso diretto al campo varDiIstanza
        istanza1.setMyPrivateVar("istanza1Name");

        MiaClasse istanza2 = new MiaClasse();
        istanza2.setVarDiIstanza(70);  // accesso al campo varDiIstanza tramite metodo setVarDiIstanza
        istanza2.setMyPrivateVar("istanza2Name");

        System.out.println("istanza2.elaboraValoreVarDiIstanza(3) = " + istanza2.elaboraValoreVarDiIstanza(3));
        System.out.println("istanza1.toString(1): " + istanza1.toString("istanza1",1));
        System.out.println("[ADDRESS] istanza1.toString(): " + istanza1.toString());
        System.out.println("[ADDRESS] istanza2.toString(): " + istanza2.toString());
//    istanza1.setMyPrivateVar("");
    }
}


