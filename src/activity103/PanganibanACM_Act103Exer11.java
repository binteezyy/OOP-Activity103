package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer11 {
	public static void main(String[] args) {
        double g = 32.174;
        double seconds = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of seconds"));
        double distance = 0.5 * g * Math.pow(seconds, 2);
        JOptionPane.showMessageDialog(null, "Distance: " + (float) distance + " feet");
    }
}
