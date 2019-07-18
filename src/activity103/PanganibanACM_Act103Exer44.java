package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer44 {
	public static void main(String[] args) {
        double epsilon = 1E-12;
        double term, sum = 1, f = 1;
        int n = 1;
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter x:"));
        double N = x;
        String message = "";
        while (true) {
            term = N / f;
            sum += term;
            message += "n:" + n + " term: " + term + "\tsum: " + sum + "\n";
            n++;
            if (term < epsilon)
                break;
            N *= x;
            f *= n;
        }
        message += "my e^x: " + sum + "\n";
        JOptionPane.showMessageDialog(null, message + "real e^x: " + Math.exp(x));
    }
}
