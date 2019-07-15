package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer14 {
	public static void main(String[] args) {
        int purchase = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of purchases"));
        JOptionPane.showMessageDialog(null, "Discounted price: " + (int) (purchase* .9));
    }
}
