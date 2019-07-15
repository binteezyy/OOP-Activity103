package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer21 {
	public static void main(String[] args) {
        float tair = Float.parseFloat(JOptionPane.showInputDialog("Enter air temperature: "));
        float tsteam = Float.parseFloat(JOptionPane.showInputDialog("Enter steam temperature: "));
        tsteam = (tsteam < 373) ? tair : tsteam;
        float efficiency = 1 - (tair / tsteam);
        JOptionPane.showMessageDialog(null, "Efficiency: " + efficiency);
    }
}
