package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer10 {
	public static void main(String[] args) {
        float rate = Float.parseFloat(JOptionPane.showInputDialog("Enter cost per kilowatt-hour in cents"));
        float kwh = Float.parseFloat(JOptionPane.showInputDialog("Enter kilowatt-hours used per year"));
        float cost = rate / 100 * kwh;
        JOptionPane.showMessageDialog(null,  "Annual cost: " + cost);
    }
}
