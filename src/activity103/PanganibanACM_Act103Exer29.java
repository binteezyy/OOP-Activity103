package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer29 {
	public static void main(String[] args) {
        String inputString = JOptionPane.showInputDialog("Enter a word: ");
        int times = inputString.length();
        String message = "";
        for (int i = 0; i < times; i++) {
            message += inputString + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
