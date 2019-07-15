package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer09 {
	public static void main(String[] args) {

        int voltage = Integer.parseInt(JOptionPane.showInputDialog("Enter voltage: "));
        int resistance = Integer.parseInt(JOptionPane.showInputDialog("Enter resistance: "));

        float current = voltage / resistance;

        JOptionPane.showMessageDialog(null, "Current is: " + current);
    }
}
