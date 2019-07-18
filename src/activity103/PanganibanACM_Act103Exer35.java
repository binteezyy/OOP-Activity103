package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer35 {
	public static void main(String[] args) {
		float X = Float.parseFloat(JOptionPane.showInputDialog("Enter X"));
		int N = Integer.parseInt(JOptionPane.showInputDialog("Enter N"));
		if (X < 0) {
			JOptionPane.showMessageDialog(null, "N must be a positive integer");
		} else {
			float Xn = X;
			for (int i = 1; i < N; i++) {
				Xn *= X;
			}
			JOptionPane.showMessageDialog(null, X + " raised to the power " + N + " is: " + Xn);
		}
	}
}
