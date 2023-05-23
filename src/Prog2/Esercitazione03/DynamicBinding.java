package Prog2.Esercitazione03;

class Persona{
    public void parla() {
        System.out.println("Persona Parla");
    }
}
class Docente extends Persona{
    public void parla() {
        System.out.println("Persona Parla");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Persona Andrea = new Persona();
        Persona Daniele = new Docente();

        Andrea.parla(); //  Andrea è persona
        Daniele.parla(); // Daniele è docente
    }
}
