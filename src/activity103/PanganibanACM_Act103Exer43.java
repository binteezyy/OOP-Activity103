package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer43 {
	public static void main(String[] args) {
    	int month = 0;
        double effectiveness = Double.parseDouble(JOptionPane.showInputDialog("Enter effectiveness:"));
        double half = effectiveness / 2;
        String message = "";
        while (true) {
            message += "month: " + (month++) + " effectiveness: " + effectiveness + "\n";
            effectiveness *= 0.96;
            if (effectiveness < half) {
                message += "month: " + month + " effectiveness: " + effectiveness + " DISCARDED" + "\n";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
