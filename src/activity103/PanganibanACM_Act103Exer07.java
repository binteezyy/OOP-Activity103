package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer07 {
	public static void main(String[] args) {
        String cash = JOptionPane.showInputDialog("Input the cents: ");
        int cash_int = Integer.parseInt(cash);
        int cents = cash_int % 100;
        int dollar = cash_int / 100;
        JOptionPane.showMessageDialog(null,"That is " + dollar + " dollars and " + cents + " cents");
    }
}
