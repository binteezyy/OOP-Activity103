package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer20 {
	public static void main(String[] args) {
        String i = JOptionPane.showInputDialog("Enter the item: ");
        double price = (Double.parseDouble(JOptionPane.showInputDialog("Enter the price: "))) / 100.00;
        double shipping = price >= 10 ? 3.00 : 2.00;

        int overnight = Integer.parseInt(JOptionPane.showInputDialog("Overnight delivery (0==no, 1==yes)"));
        if (overnight == 1)
            shipping += 5.00;

        JOptionPane.showMessageDialog(null, "Invoice:" + "\n " +
        		i + " " + price + "\n" +
        		"shipping " + shipping + "\n" +
        		"total " + (price + shipping));
    }
}
