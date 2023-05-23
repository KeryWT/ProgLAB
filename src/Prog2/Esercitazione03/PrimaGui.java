package Prog2.Esercitazione03;

import java.awt.*;
import javax.swing.*;
public class PrimaGui {
    public static void main(String[] args) {
        JFrame window = new JFrame("prima finestra");  // nome finestra

        Container c = window.getContentPane();
        c.add(new JLabel("Ciao Mamma ti voglio bene"));
        window.setSize(200, 200);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setVisible(true);
    }
}
