package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer16 {
	public static void main(String[] args) {
        int tankCapacity = Integer.parseInt(JOptionPane.showInputDialog("Tank capacity: "));
        int Gage = Integer.parseInt(JOptionPane.showInputDialog("Gage reading: "));
        int MPG = Integer.parseInt(JOptionPane.showInputDialog("Miles per gallon"));
        JOptionPane.showMessageDialog(null, (200 <= (int) ((tankCapacity * (Gage * 1.0 / 100)) * MPG)) ? "Safe to proceed" : "Get Gas!");
    }
}
