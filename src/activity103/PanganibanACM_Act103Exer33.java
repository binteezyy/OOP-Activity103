package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer33 {
	public static void main(String[] args) {
		double avg = 0, avgsq = 0, N, num;
		double sd;
		N = Integer.parseInt(JOptionPane.showInputDialog("Enter N: "));
		JOptionPane.showMessageDialog(null, "Enter the numbers: ");

		for (int i = 0; i < N; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog(""));
			avg += num;
			avgsq += num * num;
		}
		avg /= N;
		avg *= avg;
		avgsq /= N;
		sd = Math.sqrt(avgsq - avg);
		JOptionPane.showMessageDialog(null, "Standard deviation is: " + sd);
	}
}
