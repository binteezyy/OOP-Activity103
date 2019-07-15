package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer13 {
	public static void main(String[] args) {
        float X = Float.parseFloat(JOptionPane.showInputDialog("Enter Y: "));
        float Y = Float.parseFloat(JOptionPane.showInputDialog("Enter X: "));
        float A = (X + Y) / 2;
        double H = 2.0 / (1.0 / X + 1.0 / Y);
        JOptionPane.showMessageDialog(null, "Arithmitic mean: " + A + "\n" + "Harmonic mean: " + H);
    }
}
