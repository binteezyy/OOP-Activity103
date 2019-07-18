package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer37 {
	public static void main(String[] args) {
		String message = "";
		for (int x = 8, y = 1; x > 0; x--, y += 2) {
			for (int n = x; n > 0; n--) {
				message += " ";
			}
			for (int n = y; n > 0; n--) {
				message += "*";
			}
			message += "\n";
		}
		for (int x = 0; x < 3; x++) {
			for (int z = 1; z < 8; z++) {
				message += " ";
			}
			for (int y = 0; y < 3; y++) {
				message += "*";
			}
			message += "\n";
		}
		JOptionPane.showMessageDialog(null, message);
	}
}
