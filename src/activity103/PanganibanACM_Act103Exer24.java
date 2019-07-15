package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer24 {
	public static void main(String[] args) {
        float checking = Float.parseFloat(JOptionPane.showInputDialog("Checking balance: "));
        float saving = Float.parseFloat(JOptionPane.showInputDialog("Saving balance: "));

        double charge = ((checking > 1000) || (saving > 1500)) ? 0 : 0.15;
        JOptionPane.showMessageDialog(null, "Charge: " + charge);
    }
}
