package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer38 {
	public static void main(String[] args) {
        double init, fin, gal, miles;
        String message = "Miles Per Gallon Program";
        init = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Initial miles:", message, 3, null, null, null));

        if (init < 0)
            JOptionPane.showMessageDialog(null, "bye");
        else {
            fin = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Final miles:", message, 3, null, null, null));

            gal = Double.parseDouble((String)JOptionPane.showInputDialog(null, "Gallons:", message, 3, null, null, null));

            miles = (fin - init) / gal;
//            JOptionPane.showMessageDialog(null, message + "\n" + "Miles per Gallon: " + miles);
            JOptionPane.showMessageDialog(null, "Miles per Gallon: " + miles, message, 2, null);
        }
    }
}
