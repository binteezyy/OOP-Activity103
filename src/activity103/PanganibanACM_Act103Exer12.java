package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer12 {
	public static void main(String[] args) {
        double X = Double.parseDouble(JOptionPane.showInputDialog("Enter a double: "));
        double log = Math.log(X) / Math.log(2);
        JOptionPane.showMessageDialog(null,"Base 2 log of " + X + " is " + log);
    }
}
