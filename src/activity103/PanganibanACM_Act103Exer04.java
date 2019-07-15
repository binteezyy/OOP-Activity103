package activity103;

import javax.swing.JOptionPane;

public class PanganibanACM_Act103Exer04 {
	public static void main(String[] args) {
        double value = 0.5236;
        double sinx = Math.sin(value);
        double cosx = Math.cos(value);
        double sum = Math.pow(sinx, 2) + Math.pow(cosx, 2);

        JOptionPane.showMessageDialog(null, "sine: " + sinx + " cosine: " + cosx + " sum: " + sum);
	}   
}
