package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer40 {
	public static void main(String[] args) {
		int handling = 3;
		float shipping = 0;
		int weight = 0;
		while (true) {
			weight = Integer.parseInt(JOptionPane.showInputDialog("Weight of Order:"));
			if (weight == 0) {
				break;
			} else if (weight > 10) {
				for (int i = weight - 10; i > 0; i--) {
					shipping += 0.25;
				}
			}
			JOptionPane.showMessageDialog(null, "Shipping cost: $" + (handling + shipping));
		}
		JOptionPane.showMessageDialog(null, "bye");
	}
}
