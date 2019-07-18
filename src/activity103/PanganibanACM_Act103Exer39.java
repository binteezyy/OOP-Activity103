package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer39 {
	public static void main(String[] args) {
		String title = "In-range Adder";
		int data, inR = 0, notR = 0;

		while (true) {
			data = Integer.parseInt((String)JOptionPane.showInputDialog(null, "Enter data:", title, 3, null, null, null));

			if (data == 0) {
				break;
			}
			if (data >= 20 && data <= 50) {
				inR += data;
			} else {
				notR += data;
			}
		}
		String message = "Sum of in range values: " + inR + "\n";
		JOptionPane.showMessageDialog(null, message + "Sume of out range values: " + notR, title, 2, null);
	}
}
