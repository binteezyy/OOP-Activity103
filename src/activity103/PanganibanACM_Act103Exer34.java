package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer34 {
	public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Upper Limit: "));
        int squares = 0, cubes = 0;
        squares = (n * (n + 1) * ((2 * n) + 1)) / 6;
        cubes = ((n * n) * ((n + 1) * (n + 1)) / 4);
        String message = ("The sum of Squares is " + squares + "\n");
        message += "The sume of Cubes is " + cubes;
        JOptionPane.showMessageDialog(null, message);
    }
}
