package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer28 {
	public static void main(String[] args) {
        int start = Integer.parseInt(JOptionPane.showInputDialog("Enter start: "));
        int end = Integer.parseInt(JOptionPane.showInputDialog("Enter end: "));
        String message = "";
        for (int i = start; i <= end; i++) {
        	message += Integer.toString(i) + "\n";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
