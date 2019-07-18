package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer31 {
	public static void main(String[] args) {
        int counter = Integer.parseInt(JOptionPane.showInputDialog("How many integers will be added: "));
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer"));
            sum += num;
        }
        JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
