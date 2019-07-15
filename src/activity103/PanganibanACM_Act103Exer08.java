package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer08 {
	public static void main(String[] args) {
        String change = JOptionPane.showInputDialog("Input the cents");
        int change_int = Integer.parseInt(change);
        int remaining = 0;
        int dollar = change_int / 100;
        remaining = change_int % 100;
        int quarter = remaining / 25;
        remaining %= 25;
        int dime = remaining / 10;
        remaining %= 10;
        int nickel = remaining / 5;
        remaining %= 5;

        JOptionPane.showMessageDialog(null,"Your change is: " + dollar + " dollar," + quarter + " quarter," + dime + " dime," + nickel
                + " nickel, " + remaining + " cents");
    }
}
