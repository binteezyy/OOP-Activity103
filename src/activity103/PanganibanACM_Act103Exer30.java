package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer30 {
	public static void main(String[] args) {
        String first = JOptionPane.showInputDialog("Enter first word:");
        String second = JOptionPane.showInputDialog("Enter second word: ");
        String message = first;
        for (int i = 0; i < 30 - first.length() - second.length(); i++) {
            message += ".";
        }
        message += second;
        JOptionPane.showMessageDialog(null, message);
    }
}
