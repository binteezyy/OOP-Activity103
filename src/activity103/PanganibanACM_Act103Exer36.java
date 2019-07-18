package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer36 {
	public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Initial number of stars: "));
        String message = "";
        for (int i = n; i > 0; i--) {
            for (int x = i; x > 0; x--) {
                message += "*";
            }
            message += "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
