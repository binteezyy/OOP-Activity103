package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer15 {
	public static void main(String[] args) {
        int boltPrice = 5, nutPRice = 3, washerPrice = 1;
        int bolts = Integer.parseInt(JOptionPane.showInputDialog("Number of bolts: "));
        int nuts = Integer.parseInt(JOptionPane.showInputDialog("Number of nuts: "));
        int washers = Integer.parseInt(JOptionPane.showInputDialog("Number of washers: "));

        JOptionPane.showMessageDialog(null, (bolts > nuts ? "Check the Order" : "Order is OK") + "\n" +
        		"Total cost: " + (bolts * boltPrice + nuts * nutPRice + washers * washerPrice));
    }
}
