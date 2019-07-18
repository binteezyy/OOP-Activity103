package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer32 {
	public static void main(String[] args) {
        int N = Integer.parseInt(JOptionPane.showInputDialog("Enter N: "));
        double sum = 0.0;
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        JOptionPane.showMessageDialog(null, sum);
    }
}
